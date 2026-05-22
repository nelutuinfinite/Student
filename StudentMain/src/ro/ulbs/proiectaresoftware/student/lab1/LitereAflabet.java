package ro.ulbs.proiectaresoftware.student.lab1;

public class LitereAflabet {
    String LitereAlfabet="";

    public void setLitereAlfabet() {
        char asci =97;
        for(char i=0;i<26;i++){
            LitereAlfabet +=asci++;
        }
    }
 public String getLitereAlfabet(){
        return LitereAlfabet;
 }
 public void LitereArray(String[] litere){
     LitereAlfabet="";
     char asci =97;
     int i;
     int j=0;
     for( i=0;i<4;i++){
         LitereAlfabet +=asci++;
     }
     litere[j++]=LitereAlfabet;
     LitereAlfabet="";
     for( i=0;i<4;i++){
         LitereAlfabet +=asci++;
     }
     litere[j++]=LitereAlfabet;
     LitereAlfabet="";
     for( i=0;i<6;i++){
         LitereAlfabet +=asci++;
     }
     litere[j++]=LitereAlfabet;
     LitereAlfabet="";
     for( i=0;i<6;i++){
         LitereAlfabet +=asci++;
     }
     litere[j++]=LitereAlfabet;
     LitereAlfabet="";
     for( i=0;i<6;i++){
         LitereAlfabet +=asci++;
     }
     litere[j++]=LitereAlfabet;
 }

}
