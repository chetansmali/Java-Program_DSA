public class StrAlpha {
    public static void main(String[] args) {

        //in this below code the series is creating a new obj every time
        //it take n*n memory space it bad approch 
        //this serices 1st added one value and again same value new value is added O(n*n)
        String series="";
        for (int i = 0; i < 26; i++) {
            char ch=(char)('a'+i);
            //System.out.println(ch);
            series+=ch;
        }
        System.out.println(series); 


        //to over come this memory usage we use stringbulider
        StringBuilder build=new StringBuilder();
        for (int j = 0; j < 26; j++) {
            char c=(char)('a' + j);
            build.append(c);
        }
        //for builder we need to use the toString()
        System.out.println(build.toString());



    }
}
