##docker常用命令
安装mysql
docker pull mysql
启动mysql
$ docker run --name mysql -e MYSQL_ROOT_PASSWORD=123456 -d mysql

打印容器日志
$ docker logs 容器id

显示所有的容器，包括未运行的。
$ docker ps -a

删除容器
$docker rm 容器id

启动已经存在的容器
$docker start 容器names/容器id