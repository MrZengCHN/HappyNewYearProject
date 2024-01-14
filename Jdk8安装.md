# 安装JDK

1. 查看yum库中的JDK

   ```shell
   yum search java|grep jdk
   ```

2. 选择版本安装jdk

   ```shell
   yum install -y java-1.8.0-openjdk*
   ```

3. 安装完成后，验证是否安装成功

   ```shell
   java -version
   ```

4. 查找jdk安装位置

   ```shell
   find / -name 'java'
   ```

   

