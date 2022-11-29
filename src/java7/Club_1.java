package java7;

public class Club_1 {
    private String clubName;
    private int i = 0;
    Member_1[] members = new Member_1[70];
    Member_1[] komon = new Member_1[1];
    String komonname;
    //ArrayList<Member>members=new ArrayList<>();
    public Club_1(String clubName,String komonname) {
        this.clubName = clubName;
        this.komonname=komonname;
        for (Member_1 member : members) {
            member = new Member_1(null,null);
        }
        komon[0]=new Member_1(komonname,"000000");
    }

    public void join(Member_1 member) {
        //members.add(member);
        if (members[i] == null) {
            members[i] = member;
            i++;
            return;
        }

    }
    public void delete(String memberGakuseki){
        for (Member_1 member : members){
            //System.out.println("b");
            if (member == null || member.getShimei()==null || member.getGakuseki()==null){
              //  System.out.println("a");
            }
            else if(member.getGakuseki().equals(memberGakuseki)){
                member.change();
                System.out.println("削除");
            }
        }
    }

    public void print() {
        for (Member_1 member : members) {
            if (member == null || member.getShimei()==null || member.getGakuseki()==null) {
            }
            else {
                //System.out.println("s");
                member.print();
            }
            //System.out.println("a");
        }
    }
}
