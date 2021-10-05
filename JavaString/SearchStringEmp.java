public class SearchStringEmp{
    public static void main(String[] args){
        String str0rig = "Google Runoob Taobao";
        int intIndex = str0rig.indexOf("Runoob");
        if(intIndex == -1){
            System.out.println("没有找到字符串Runoob");
        }else{
            System.out.println("Runoob字符串位置 " + intIndex);
        }
    }
}
