import java.io.*;
import java.util.*;

/*
10814, 나이순 정렬
 */
public class Silver_10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcase = Integer.parseInt(br.readLine());

        List<Member> members = new ArrayList<>();
        for (int i = 0; i < testcase; i++) {
            String[] temp = br.readLine().split(" ");
            members.add(new Member(Integer.parseInt(temp[0]), temp[1]));
        }
        Collections.sort(members);
        for (Member member : members) {
            System.out.println(member.age + " " + member.name);
        }
    }
}

class Member implements Comparable<Member>{
    int age;
    String name;

    int sequence;

    public Member(int age, String name) {
        this.age = age;
        this.name = name;
        this.sequence++;
    }

    @Override
    public int compareTo(Member o) {
        if (o.age > this.age) {
            return -1;
        } else if (o.age < this.age) {
            return 1;
        } else {
            return this.sequence - o.sequence;
        }
    }
}
