package 泛型;

/**
 * @Author:wangrui
 * @Date:2020/3/12 15:40
 */
//自定义的泛型类
public class Order<T> {
    String orderName;
    int orderId;
    //类的内部结构就可以是类的泛型
    T orderT;
    public Order(){
    }
    public Order(String orderName,int oderId,T oderT){
        this.orderName=orderName;
        this.orderId=orderId;
        this.orderT=orderT;
    }
    public T getOrderT(){
        return orderT;
    }
    public void setOrderT(T orderT){
        this.orderT=orderT;
    }

    @Override
    public String toString() {
        return "Order{"+
                "orderName='"+orderName+'\''+
                 ",orderId="+orderId+
                 ",orderT="+orderT+
                "}";
    }
}
