void main() {
    char asci =97;
    for(char i=0;i<26;i++){
       // System.out.print(asci++);
    }
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