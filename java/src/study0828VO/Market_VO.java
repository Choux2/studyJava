package study0828VO;

import java.sql.Date;

public class Market_VO {

    String mem_id;
    String mem_name;
    int mem_number;
    String addr;
    String phone1;
    String phone2;
    int height;
    Date debut_date;

    String prod_name;
    String group_name;
    int price;
    int amount;

    public String getMem_id() {
        return mem_id;
    }

    public void setMem_id(String mem_id) {
        this.mem_id = mem_id;
    }

    public String getMem_name() {
        return mem_name;
    }

    public void setMem_name(String mem_name) {
        this.mem_name = mem_name;
    }

    public int getMem_number() {
        return mem_number;
    }

    public void setMem_number(int mem_number) {
        this.mem_number = mem_number;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Date getDebut_date() {
        return debut_date;
    }

    public void setDebut_date(Date debut_date) {
        this.debut_date = debut_date;
    }

    public String getProd_name() {
        return prod_name;
    }

    public void setProd_name(String prod_name) {
        this.prod_name = prod_name;
    }

    public String getGroup_name() {
        return group_name;
    }

    public void setGroup_name(String group_name) {
        this.group_name = group_name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Market_vo{" +
                "mem_id='" + mem_id + '\'' +
                ", mem_name='" + mem_name + '\'' +
                ", mem_number=" + mem_number +
                ", addr='" + addr + '\'' +
                ", phone1='" + phone1 + '\'' +
                ", phone2='" + phone2 + '\'' +
                ", height=" + height +
                ", debut_date=" + debut_date +
                ", prod_name='" + prod_name + '\'' +
                ", group_name='" + group_name + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }
}
