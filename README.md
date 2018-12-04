# Test-Git
# 在本地创建ssh key
$ ssh-keygen -t rsa -C "1014888954@163.com"
之后会要求确认路径和输入密码，我们这使用默认的一路回车就行。成功的话会在~/下生成.ssh文件夹，进去，打开id_rsa.pub，复制里面的key。
回到github上，进入 Account Settings（账户配置），左边选择SSH Keys，Add SSH Key,title随便填，粘贴在你电脑上生成的key。

# 测试ssh key是否配置成功 

$ ssh -T git@github.com
如果是第一次的会提示是否continue，输入yes就会看到：You've successfully authenticated, but GitHub does not provide shell access 。这就表示已成功连上github。

# 将你github上的某个仓库clone到本地,例如本项目

git@github.com:caidapao/Test-Git.git

# 将本地改动的文件，加入暂存区（Index）

git add 你的文件名称

# 将暂存区的改动提交到HEAD

git commit -m '此次提交的备注'

# 将HEAD的内容推送到远程仓库

git push -u origin master



