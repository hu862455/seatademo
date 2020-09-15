### seatademo
spring cloud+mybatis+feign+seata 测试项目
### 项目结构
- order：订单服务
- account：账户服务
- storage：库存服务
### 项目入口
OrderController.saveOrder()为测试入口，模拟创建订单，保存订单后，调用feign接口模拟扣减余额和扣减库存