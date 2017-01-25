import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        int n=Integer.parseInt(sc.nextLine());        
        int i=0;
        String ns;
        ArrayList<String> information=new ArrayList<String>();
        while(i<n){        
            ns=sc.nextLine();
            information.add(ns);            
            i++;
        }
        TreeSet<String> teams=new TreeSet<String>();
        for(i=0;i<information.size();i++){            
            String[] arr=information.get(i).split("\\|");
            teams.add(arr[0]);
        }
        System.out.println("Teams and Players in ascending order");
        for(String t:teams){            
            Team team=new Team(t);
            for(i=0;i<information.size();i++){            
                String[] arr=information.get(i).split("\\|");
                if(arr[0].equals(t)){
                    team.addPlayer(arr[1]);
                }            
            }
            System.out.println(team);
            Collections.sort(team.getPlayerList());
            for(int j=0;j<team.getPlayerList().size();j++){
                System.out.println(team.getPlayerList().get(j));
            }
        }
    }
}