# Image to use
FROM nginx:alpine

# COPY HTML files to the default Nginx path
COPY ./app-1 /usr/share/nginx/html

# Expose port 80
EXPOSE 80

# docker build -t app-1 .
# docker run -d -p 80:80 --name app-1 app-1