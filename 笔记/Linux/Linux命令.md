# 账户管理

创建用户	useradd 	 用户名
用户口令	passwd   	用户名 
修改用户	usermod 	用户名
删除用户	userdel	用户名

# 用户组

创建用户组  groupadd    用户名组
修改用户组  groupmod   用户组名
查询用户所属组  groups   用户名
删除用户组    groupdel    用户组名

# 管理用户组内成员

gpasswd  -a 组名	添加用户到组
gpasswd  -d 组名	从组删除用户
gpasswd  -r 组名	删除密码
gpasswd  -R 组名	限制用户登入组

# 日期管理

date  -d<字符串> 显示日期
date   -s<字符串>设置日期和时间
date   -u      显示GMT

# 显示用户

logname     显示登录账号的信息 
su  root       切换用户

## id  查看当前用户的详细信息(用户id，群组id，所属组)

sudo     提高普通用户的操作权限
top命令	top [-][d delay] [q][c] [S][s] [i][n] [b]
top          实时显示所有的进程信息
top  -c 	实时显示所有的进程信息(完整)
top  -p PID  实时显示置顶进程的信息
结束监视快捷键  q

# ps命令	   ps [options][--help] 	

ps	    显示当前正在运行的进程信息
ps  -A   	    显示系统中所有的进程信息
ps  -ef	    显示系统中所有的进程信息(完整)
ps –u 用户名 显示指定用户的进程信息

# kill命令

kill 	     进程PID  杀死指定进程
 kill -9 	     进程PID 彻底杀死指定进程 
kill -9 $(ps –ef | grep 用户名)        杀死指定用户所有进程
 killall –u 用户名      杀死指定用户所有进程

# 关机命令

shutdown 	不同的版本有所差异
shutdown –h now   麻溜的立马关机
shutdown +1       “警告信息” 墨迹一分钟再关机，并出现警告信息
shutdown –r +1   “警告信息” 墨迹一分钟再重启，并出现警告信息 
shutdown -c           取消当前关机操作 

# 重启命令

reboot 	麻溜的立马重启 

# who命令	who - [husfV][user]

who 	显示当前登录系统的用户 
who –H 	显示明细（标题）信息 

# timedatectl命令	校正服务器时间、时区

timedatectl status 显示系统的当前时间和日期 
timedatectl list-timezones 查看所有可用的时区 
timedatectl set-timezone "Asia/Shanghai“ 设置本地时区
timedatectl set-ntp false 禁用时间同步
timedatectl set-time “2019-03-11 20:45:00“ 设置时间
timedatectl set-ntp true 启用时间同步 

# clear 	清除屏幕

# ls命令	语法：ls [选项]  目录名称

ls 	显示不隐藏的文件与文件夹 
ls -l 	显示不隐藏的文件与文件夹的详细信息
ls –al 	显示所有文件与文件夹的详细信息 
ll 	显示所有信息 不包括隐藏
pwd -p  查看目前所在目录

# cd命令	

cd [相对路径或绝对路径]

# mkdir命令	mkdir [-p] 文件夹的名字 

mkdir 		文件夹名 创建目录
mkdir -p aaa/bbb 	创建多级目录 
rmdir命令		rmdir [-p] 文件夹名字 
rmdir 文件夹名 	删除目录 
mkdir -p aaa/bbb 	删除bbb，如果删完之后aaa是空的，aaa也一起删除 

# cp命令		cp [选项] 数据源 目的地 

cp 数据源 目的地 	将指定的文件拷贝到指定目录里面 

# rm命令		rm  [选项]  文件/目录 

rm 		文件路径 删除文件 
rm –r 目录路径 	删除目录和目录里面所有的内容 

# mv命令		mv [选项] 数据源 目的地 

mv 数据源 目的地 	改名、移动 
mv 文件名  文件名	将源文件改名为目标文件名
mv 文件名  目录名	将文件移动到目标目录
mv 目录名  目录名	目标目录存在,将源目录移动到目标目录;不存在,改名
mv 目录名  文件名	出错

# Linux 文件基本属性

drwxr-xr-x 第1位：  
⚫ d 目录 
⚫ -文件；
⚫ l 为链接文档；
 2-4位：属主权限
 5-7位：属组权限
 8-10位：其他用户权限
r    读	4
w  写	2
x   执行	1

-   无权限	0
  chgrp命令
  hgrp -v root aaa 	将aaa文件的属组改为root
  chown命令
  hgrp -v root aaa 		将aaa文件的属组改为root 
  hown itcast : itcast aaa 	将aaa文件的属主和属组改为itcast 
  hmod命令	作用：修改属主、属组、其他用户的权限
   user     属主权限	u 	
  ⚫ group  属组权限 g 
  ⚫ others  其他权限 o
  ⚫ 全部身份      a

# touch命令

如果文件不存在就创建文件
如果存在就修改时间属性
touch a.txt 不存在就创建，存在就修改时间属性
touch a{1..10}.txt 批量创建空文件 
stat a.txt 查看文件的详细信息 
vi/vim编辑器
"i"    进行编辑
q  没有任何操作退出
:wq!   强制保存退出

# 文件查看

## cat命令	查看小型文件

cat a.txt  		查看a.txt的内容 
cat –n a.txt  	查看a.txt的内容（加入行号）
less命令	查看大文件
less a.txt  		查看a.txt的内容 
less –N a.txt  	查看a.txt的内容（加入行号）

## tail命令	查看文件的最后部分(查看日志)

tail –3 big.txt 	显示文件最后3行   
tail -f big.txt 	动态显示最后10行 
tail -4f big.txt 	动态显示最后4行 
tail  -n +2  big.txt 	显示文件a.txt 的内容，从第2 行至文件末尾 
tail -c 45 big.txt 	显示最后一些字符

## head命令		查看文件的前一部分

## grep命令	根据关键词, 搜索文本文件内容

grep 关键字 small.txt 把包含关键字的行展示出来
grep –n 关键字 small.txt 把包含关键字的行展示出来且加上行号 
grep –i 关键字 small.txt 把包含关键字的行展示出来，搜索时忽略大小写 
grep –v 关键字 small.txt 把不包含关键字的行展示出来
ps -ef | grep  关键字 查找指定的进程信息，包含grep进程 ps -ef | grep 关键字 | grep -v “grep” 查找指定的进程信息，不包含grep进程 
ps -ef|grep -c sshd 查找进程个数

# 异常处理

如果 vim异常退出, 在磁盘上可能会保存有 交换文件 
下次再使用 vim 编辑文件时,会看到.swp文件
将后缀名为.swp的文件删除即可恢复

# echo命令

echo 字符串 展示文本 
echo 字符串 >文件名 将字符串写到文件中（覆盖文件中内容） 
echo 字符串 >> 文件名 将字符串写到文件中（不覆盖文件中内容） cat 不存在的目录 &>> 
error.log 将命令的失败结果 追加 error.log文件的后面 

# awk命令

可以切割,可以按照指定格式输出

# 软连接

ln -s  目标文件路径 快捷方式路径

# find命令		  

在指定目录下查找文件

find . -name “*.txt” 查找当前目录及其子目录下所有后缀名名是txt的文件 
find . -ctime -1 	   查找当前目录及其子目录下所有最近1天内更新过的文件 
find / -name  'czbk'     /代表是全盘搜索,也可以指定目录搜索

# 压缩

## gzip命令	压缩文件

gizp 	      a.txt 压缩文件 
gzip *	     压缩当前目录下所有文件 
gzip -dv *     解压文件并列出详细信息 

## gunzip命令	解压文件

gunzip 压缩文件	 解压 

## tar命令	打包、压缩和解压（文件/文件夹)

注意：tar本身不具有压缩功能。他是调用压缩功能实现的。

tar -cvf 	打包文件名文件名 打包文件并指定打包之后的文件名（仅打包不压缩） 
tar -zcvf 	压缩文件名文件名/文件夹名 压缩文件或者文件夹并指定压缩文件名（打包压缩） 
tar -ztvf 	压缩文件名 	查看压缩文件中有哪些文件 
tar –zxvf 压缩文件名 	解压 

## zip命令 	压缩 

注意：zip是个使用广泛的压缩程序，文件经它压缩后会另外产生具有".zip"扩展名的压缩文件。
zip -q -r  压缩文件名文件/文件夹 	压缩 

## unzip命令		解压 

注意：解压".zip"扩展名的压缩文件。
unzip -l 	压缩文件 名 查看这个压缩文件中有多少内容 
unzip -d 	指定文件夹 压缩文件 解压 

## bzip2命令		压缩

# ifconfig命令	

显示或配置网络设备的命令

ping命令		检测是否与主机连通
ping www.baidu.com 	检测是否与百度连通 
ping -c 2 www.baidu.com 	指定接收包的次数 
netstat命令	显示网络状态
netstat –a 	显示详细的连接状况 
netstat –i 		显示网卡列表 

# lsblk命令		

列出硬盘的使用情况 

lsblk 	列出硬盘的使用情况 
lsblk –f 	显示系统信息 

# df命令	

显示目前在Linux系统上，硬盘的使用情况

df	 显示整个硬盘使用情况 
df 文件夹 	  显示文件夹使用情况 
df –total 	显示所有的信息 
df -h 	将结果变成KB，MB，GB形式展示，利于阅读 

# mount命令    

 用于挂载Linux系统外的设备

mkdir  -p mnt/cdrom 	创建文件夹（也是创建一个挂载点） 

mount -t auto /dev/cdrom /mnt/cdrom 	开始挂载 

umount ./mnt/cdrom/ 	卸载 

# fdisk命令		

创建和维护分区的程序
fdisk -l 		显示当前分区情况 
fdisk /dev/sdb        开始指定磁盘分区 

# yum	

类似于360软件管家
yum  check-update	   列出所有可更新的软件清单命令
yum update	 更新所有软件命令
yum install <packagename>		下载安装指定软件
yum update <packagename>		更新指定的软件
yum list		列出所有可安装的软件清单

## 清除缓存命令

yum clean packages:  清除缓存目录下的软件包
yum clean headers:	    清除缓存目录下的headers
yum clean oldheaders: 清除缓存目录下旧的headers
yum update <packagename>

## 下载安装及卸载流程

yum  -y install tree   安装tree
tree     使用tree
yum remove tree  移除tree
yum list tom*   查找和tom开头所有的软件

## 备份yum源

cd /etc/yum.repso.d/  	 
mv CentOS-Base.re.repo CentOS-Base.re.repo.back

## 更新yum源

yum install -y wget		下载安装工具wget
wget -O CentOS-Base.repo http://mirrors.aliyun.com/repo/Centos-7.repo
下载阿里云的Centos-7.repo文件
yum clean all 	清理之前的缓存  重新加载yum
yum makecache	建立一个缓冲文件
yum search tomcat	  查找软件,验证阿里云的yum源是否可以正常使用



## 防火墙问题

查看防火墙状态： systemctl status firewalld.service
绿的running表示防火墙开启
执行关闭命令： systemctl stop firewalld.service
再次执行查看防火墙命令：systemctl status firewalld.service
执行开机禁用防火墙自启命令  ： systemctl disable firewalld.service

启动：systemctl start firewalld.service
防火墙随系统开启启动  ： systemctl enable firewalld.service