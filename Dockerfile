FROM alpine:latest
ADD FOLDER /linux-ex/
RUN apt install build-essential
EXPOSE 9000
LABEL version=”1.0”
LABEL description=”Image for running nasm in dockerfile”
CMD ["app", "java -jar run.jar"]