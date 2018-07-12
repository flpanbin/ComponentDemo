# ComponentDemo
this is a mini demo for android component programming


遇到的问题：
1. 将公共组件的dependencies中的implementation改为api, 否则其他组件不能使用公共组件中引用的library。
2. App运行时，没有跳转到指定module的页面，而且启动了当前的页面，经过分析怀疑文件名相同导致的，三个module的Activity都是MainActivity，资源文件都是activity_main.xml，于是将文件修改为不同的文件名后，再次运行跳转成功。
经过测试发现是由于xml 文件名相同导致资源冲突。
