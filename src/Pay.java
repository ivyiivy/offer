public abstract class Pay {
   abstract void pay();
}

class MyPay extends Pay{
    private String userName;
    private String userPhone;
    private String payId;
    private String payAddress;
    private String goodId;
    private String payTime;
    private String payMoney;

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId;
    }

    public String getPayAddress() {
        return payAddress;
    }

    public void setPayAddress(String payAddress) {
        this.payAddress = payAddress;
    }

    public String getGoodId() {
        return goodId;
    }

    public void setGoodId(String goodId) {
        this.goodId = goodId;
    }

    public boolean isPayAction() {
        return payAction;
    }

    public void setPayAction(boolean payAction) {
        this.payAction = payAction;
    }

    private String payUtile;
    private boolean payAction;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    public String getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(String payMoney) {
        this.payMoney = payMoney;
    }

    public String getPayUtile() {
        return payUtile;
    }

    public void setPayUtile(String payUtile) {
        this.payUtile = payUtile;
    }


    @Override
    public void pay() {
        if (payAction==true){
            System.out.println("Pay Successfully");
        }
    }
}

