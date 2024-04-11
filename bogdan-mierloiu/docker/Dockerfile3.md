# run two containers with different volumes
```
docker run -d -v /root/app-1:/usr/share/nginx/html --name app-1 nginx:alpine \
> && \
> docker run -d -v /root/app-2:/usr/share/nginx/html --name app-2 nginx:alpine

# -d -> run in detached mode
# -v -> bind mount the volume -> mount /root/app-1 from the host to /usr/share/nginx/html in the container
```

```
docker network inspect bridge -> inspect the bridge network
```

```
docker exec app-1 sh -c `curl -SS 172.17.9.3` -> execute a get request on the container to the second container

sh -c -> run the command in the shell
```

```
docker network create --driver bridge bridge-network create a new bridge network # create a new bridge network
```

```

docker network disconnect bridge app-1 \
&& \
docker network disconnect bridge app-2     #disconnect the containers from the bridge network
```

``` 


docker run -d -v /root/app-1:/usr/share/nginx/html --name app-1 --network host nginx:alpine # run the container in host network mode
```