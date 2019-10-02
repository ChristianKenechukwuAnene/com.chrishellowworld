import javax.swing.*;

public class TestMember {

        public static void main(String[]args){    //Driver class
            //Member member;
            Member [] member = new Member[2];
            String name;

            for(int i=0; i < member.length;i++){

                name = JOptionPane.showInputDialog("Enter name");
                member[i] = new Member(name);
            }



    JTextArea jta = new JTextArea("club membership\n\n");
    for (int i = 0; i< member.length; i++){
        jta.append(member[i].toString());
    }
        JOptionPane.showMessageDialog(null,jta);

        System.exit(0);
}
}
