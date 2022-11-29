package java7;

import java.util.ArrayList;

public class Club {
    private String clubName;
    private int i = 0;
    Member[] members = new Member[70];

    //ArrayList<Member>members=new ArrayList<>();
    public Club(String clubName) {
        this.clubName = clubName;
        for (Member member : members) {
            member = new Member(null,null);
        }
    }

    public void join(Member member) {
        //members.add(member);
        if (members[i] == null) {
            members[i] = member;
            i++;
            return;
        }

    }

    public void print() {
        for (Member member : members) {
            if (member == null) {
            }
            else {
                //System.out.println("s");
                member.print();
            }
            //System.out.println("a");
        }
    }
}
