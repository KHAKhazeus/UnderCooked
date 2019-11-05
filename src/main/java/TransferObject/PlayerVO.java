package TransferObject;

/**
 *  操作对象类，用setter、getter方法
 */
public class PlayerVO {
    private String name;
    private int rollNo;
    /**
     * @description:  PlayerVO构造函数
     * @param: String，int
     * @return null
     */
    PlayerVO(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }
    /**
     * @description:  获取姓名
     * @param: null
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * @description:  设置玩家姓名
     * @param: String
     * @return null
     */
    public void setName(String name) {
        System.out.println("PlayerVO:setName:("+ this.toString() + "): NewName: " + name);
        this.name = name;
    }

    /**
     * @description:  获取玩家编号
     * @param: null
     * @return null
     */
    public int getRollNo() {
        return rollNo;
    }
}
