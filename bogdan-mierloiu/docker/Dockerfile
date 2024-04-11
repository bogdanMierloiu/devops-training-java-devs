FROM alpine

WORKDIR /app

# Copy the entire directory named "source_directory" from the local system to the container's "/app" directory
# Use the "COPY" instruction for copying directories and "ADD" for fetching files from external sources
COPY source_directory /app

# Add data from an external source (e.g., a URL) to the container's "/app" directory
ADD https://example.com/data/data_file.txt /app

# Add a file from the local system to the container's "/app" directory
ADD local_file.txt /app




# docker build -t <image_name> .
# docker run --rm <image_name>