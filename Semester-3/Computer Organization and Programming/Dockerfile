# Use a base image with a Linux distribution
FROM --platform=linux/amd64 ubuntu:22.04
# Set environment variables
ENV DEBIAN_FRONTEND=noninteractive

# Update package lists and install necessary packages
RUN apt-get update && \
    apt-get install -y \
    build-essential \
    binutils \
    gdb \
    gcc-multilib \
    valgrind \
    vim 

# Set the working directory
WORKDIR /work

# Start a shell by default
CMD ["/bin/bash"]