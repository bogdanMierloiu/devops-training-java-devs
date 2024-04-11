
## build with arguments
```
ARG GO_VERSION=1.21
FROM golang:${GO_VERSION}-alpine AS base # set the go version as an argument

docker build --build-arg="GO_VERSION=1.22 ." # build with a different version of golang as argument

docker build --build-arg="GO_VERSION=1.22" -t image_name .   # set image name -t flag
```

### MULTIPLE ARGUMENTS WITH IF CLAUSE:
```
ARG GO_VERSION
ARG GO_VERSION-2

FROM golang:${GO_VERSION}-alpine AS base

# Check if GO_VERSSION is present, if not use GO_VERSION2
RUN if [ -z "$GO_VERSION" ]; then \
        GO_VERSION=$GO_VERSION2; \
    fi \
    && echo "Using Go version: $GO_VERSION"



docker build --build-arg="GO_VERSION=1.22" --build-arg="GO_VERSION2=1.21" -t image_name .  
```

### exporting binaries from server and client images

```
FROM scratch AS binaries
COPY --from=server /bin/server /
COPY --from=client /bin/client /

docker build --output=/root/app --target=binaries .
```

