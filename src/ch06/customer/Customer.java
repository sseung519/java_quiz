package ch06.customer;

public class Customer {
   private String name;
   private String phone;
   private String addr;
   private long totalPoint;

    public long getTotalPoint() {
        return totalPoint;
    }

    public void setTotalPoint(long totalPoint) {
        this.totalPoint = totalPoint;
    }

    public Customer(String name, String phone, String addr, long totalPoint){
       this.name = name;
       this.phone = phone;
       this.addr = addr;
       this.totalPoint = totalPoint;
   }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }


}
