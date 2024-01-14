1. 在 root 目录下，安装 `mysql` 和 `mysql-devel`

```shell
yum install mysql
yum install mysql-devel
```

2. 安装 `mysql-server`

```shell
wget http://dev.mysql.com/get/mysql80-community-release-el7-5.noarch.rpm
rpm -ivh mysql80-community-release-el7-5.noarch.rpm
yum install mysql-community-server
```

3. 安装成功后重启`mysql`服务

```shell
service mysqld restart
```

4. 设置密码

先通过`cat /var/log/mysqld.log | grep password `命令查看密码

```shell
# 登录mysql并输入密码
mysql -u root -p

# mysql8 修改密码方式
alter user 'root'@'localhost' identified by '这里填你要的密码';
```

5. 配置远程连接授权设置（配置后即可用navicat建立连接），至此完成安装！

```shell
# 如果要授权的用户是新用户，而不是root账户，则要先新建用户；如果要授权的是root用户，则跳过此命令
CREATE USER '这里填你要新建的账户'@localhost  IDENTIFIED BY '这里填要新建账户的密码';

# 授权，以root账户为例
GRANT ALL PRIVILEGES ON *.* TO 'root'@localhost WITH GRANT OPTION;

FLUSH PRIVILEGES;
```

报错：`1130 - Host 'xxx' is not allowed to connect to this MySQL server`

解决方法：

```shell
1、执行登陆MySQL mysql -u root -p 密码
2、执行use mysql;
3、执行update user set host = '%' where user = 'root';
4、执行FLUSH PRIVILEGES;
```

