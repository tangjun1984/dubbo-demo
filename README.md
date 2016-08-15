# dubbo-demo
dubbo 官方git的例子有点复杂,这里自行查资料做了一个demo

注册中心:zookeeper-3.4.6
<dubbo:registry address="zookeeper://127.0.0.1:2181" />

MacBook,使用multicast广播注册中心暴露发现服务地址提示 Cannot assign requested address 问题:
<dubbo:registry address="multicast://224.0.0.0:1234" />