package LeetCode.String;

public class MaximumRepatingSubString {

    public static void main(String[] args) {

    }

    public int maxRepeating(String sequence, String word) {

        if (!sequence.contains(word)) return 0;


        int count = 0;

        int subStringLength = word.length();

        int stringLength = sequence.length();


        int range =  sequence.length() - subStringLength;



        for (int i = 0; i <= range;) {

            String subString = sequence.substring(i, (i + subStringLength));

            if (word.equals(subString)) {

                int j = i + subStringLength;

                int mainCount = 1;

                while ((j ) <  sequence.length()) {

                    int nextSubStringIndex = j;

                    if (nextSubStringIndex >=  stringLength ||
                            (nextSubStringIndex + subStringLength) > stringLength)
                        return Math.max(count, mainCount);


                    String nextSubString = sequence.substring(nextSubStringIndex,
                            nextSubStringIndex + subStringLength);

                    if (nextSubString.equals(word))  {
                        System.out.println("yes");
                        mainCount++;
                        i = j;
                    }


                    else {
                        i++;
                        break;
                    }
                    j = nextSubStringIndex + subStringLength;

                }

                count = Math.max(count, mainCount);

                if (i != j) i++;

                continue;

            }

            i++;

        }


        return count;

    }

}
