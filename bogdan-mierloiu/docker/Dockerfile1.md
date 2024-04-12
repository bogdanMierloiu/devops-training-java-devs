`FROM bash
CMD ["ping","localhost"]` -> build -> run -> ping localhost

docker build -t pinger:0.0.1 .
docker run --name my-pinger pinger:0.0.1

`docker inspect cmd-echo | jq .[0].ContainerConfig.Cmd` -> inspect the container and get the command that was run
`docker run --rm --entrypoint date cmd-echo` -> override the entrypoint with date

`# syntax=docker/dockerfile:1
FROM golang:1.21doc-alpine AS base
WORKDIR /src
COPY go.mod go.sum /src/
RUN go mod download
COPY . .

#build client
FROM base AS build-client
RUN go build -o /bin/client ./cmd/client

#build server
FROM base AS build-server
RUN go build -o /bin/server ./cmd/server

#copy client binary to client mage
FROM scratch AS client
COPY --from=build-client /bin/client /bin/
ENTRYPOINT [ "/bin/client" ]


#copy server binary to server image
FROM scratch AS server
COPY --from=build-server /bin/server/ /bin/
ENTRYPOINT ["/bin/server"]`

`docker build -t run-client --target=client .`
`docker build -t run-server --target=server .`