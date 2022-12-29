public class scores {
    public static void main(String[] args) {
        int scores[][] = {
                {92, 78, 95},
                {89, 79, 98},
                {98, 94, 89},
                {99, 86, 87}
        };
        String[] students = {"A", "B", "C"};
        String[] subjects = {"英語", "国語", "数学", "理科"};
        int studentLength = students.length;
        int subjectLength = subjects.length;



        System.out.println("==================");
        System.out.println("各教科のデータ");
        for (int i=0; i<subjectLength; i++) {
            System.out.print(subjects[i]+" ");
            System.out.print(calcMaxScore(scores[i])+" ");
            System.out.print(students[findMaxScoreStudentId(scores[i])]+" ");
            System.out.println(calcAverage(scores[i]));
        }
        System.out.println("==================");

        
        int[] sum_scores = new int[studentLength];
        // 二次元配列を縦方向に数値を取得して合計点を算出しリストに格納する。
        for (int i=0; i<studentLength; i++) {

            int[] studentScores = new int[subjectLength];
            for (int j=0; j<subjectLength; j++) {
                studentScores[j] = scores[j][i];
            }

            sum_scores[i] = calcSumScore(studentScores);
        }

        int maxScore = calcMaxScore(sum_scores);
        String maxStudent = students[findMaxScoreStudentId(sum_scores)];
        int averageScore = calcAverage(sum_scores);

        System.out.println("合計点のデータ");
        System.out.print(maxScore+ " ");
        System.out.print(maxStudent+ " ");
        System.out.println(averageScore);
        System.out.println("==================");

        System.out.print("name: ");
        String name = new java.util.Scanner(System.in).nextLine();
        int nameId = findStudentId(name, students);

        System.out.print("subject: ");
        String subject = new java.util.Scanner(System.in).nextLine();
        int subjectId = findSubjectId(subject, subjects);


        int yourScore = scores[subjectId][nameId];
        int maxPoint = calcMaxScore(scores[subjectId]);
        System.out.println("あなたの"+subject+"の点数は"+yourScore+"です");
        System.out.println(subject+"の最高点: "+maxPoint+" 点");
        if (yourScore == maxPoint) {
            System.out.println("あなたは"+subject+"で最高得点です");
        }
        else {
            int missPoint = maxPoint - yourScore;
            System.out.println(subject+"の最高点まで"+missPoint+"点足りません");
        }
        System.out.println("==================");

    }

    public static int calcMaxScore(int[] array) {
        // 配列の中の一番大きい値を返す
        int maxScore = 0;
        for (int j : array) {
            if (maxScore < j) {
                maxScore = j;
            }
        }

        return maxScore;
    }

    public static int findMaxScoreStudentId(int[] array) {
        // 配列の中の一番大きな数値のindex番号を返す
        int studentId = 0;
        int max_sore = 0;
        for (int i=0; i<array.length; i++) {
            if (max_sore < array[i]) {
                max_sore = array[i];
                studentId = i;
            }
        }

        return studentId;
    }

    public static int calcAverage(int[] array) {
        // 配列内のすべての値の平均値を返す
        int sum = 0;
        for (int i=0; i<array.length; i++) {
            sum += array[i];
        }

        return sum / array.length;
    }

    public static int calcSumScore(int[] array) {
        // 配列内のすべての値の合計値を返す
        int sum = 0;
        for (int i=0; i<array.length; i++) {
            sum += array[i];
        }

        return sum;
    }

    public static int findStudentId(String query, String[] array) {
        int id = 0;
        for (String str: array) {
            if (str.equals(query)) {
                return id;
            }
            id++;
        }
        return id;
    }

    public static int findSubjectId(String query, String[] array) {
        int id = 0;
        for (String str: array) {
            if (str.equals(query)) {
                return id;
            }
            id++;
        }
        return id;
    }

}