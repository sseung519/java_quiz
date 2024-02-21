package ch06.quiz15;

public class MemberService {
    String id;
    String password;

   boolean login(String id, String password ){
//        this.id = id;
//        this.password = password;
        if(id.equals("hong") && password.equals("12345") ){
            return true;
        } else {
            return false;
        }

    }

   void logout(String id){
       if(id.equals("hong")){
           System.out.println(id + "님 로그아웃 되었습니다.");
       }
   }
}
