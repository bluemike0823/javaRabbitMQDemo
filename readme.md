
## Step 1 : init rabbitmq

1. docker pull rabbitmq:3.12.4-management
2. docker run -d -p 5672:5672 -p 15672:15672 --name DemoRabbitMQ -e RABBITMQ_DEFAULT_USER=rabbitmq -e RABBITMQ_DEFAULT_PASS=rabbitmq 4c62a24d32fc

## Step 2 : work producer or consumer

1. start producer/runApp.bat to work batch creating messages
2. start consumer/runApp.bat to get messages which is in queue

## reference
- https://ithelp.ithome.com.tw/m/articles/10333620