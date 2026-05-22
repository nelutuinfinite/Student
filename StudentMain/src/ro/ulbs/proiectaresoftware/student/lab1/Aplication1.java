import ro.ulbs.proiectaresoftware.student.lab1.LitereAflabet;

void main() {
    LitereAflabet a= new LitereAflabet();
    String[] AlfabetArray= new String[5];
    a.setLitereAlfabet();
    String Alfabet= a.getLitereAlfabet();
    a.LitereArray(AlfabetArray);
    for(int i=0;i<5;i++){
        System.out.println(AlfabetArray[i]);
    }
    System.out.println(Alfabet.toLowerCase());
    System.out.println(Alfabet.toUpperCase( ));

    String[] Student;
    String cuvant="123";
    File fis = new File("C:\\Users\\nelut\\IdeaProjects\\Student\\StudentMain\\src\\ro\\ulbs\\proiectaresoftware\\student\\lab1\\studenti_in.txt");

    try(Scanner sc =new Scanner(fis)){

        while(sc.hasNextLine()){
            cuvant= sc.nextLine();
            Student= cuvant.split(",");
            System.out.println(Student[2]);
        }

    } catch (FileNotFoundException e) {
        System.out.print(e);
    }
}