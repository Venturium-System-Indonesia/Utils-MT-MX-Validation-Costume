import vensys.CheckFalsePositiveCollon;
import vensys.CheckRealTruncate;

public class test {
    public static String translateSpecialCharactersFullStop(String source) {
        return source.replaceAll("[!#&%*=^\\\\_{|}~\";@\\[\\]$><]", ".");
    }

    public static void main(String[] args) {

        String mt = "{1:F21BNIAIDJ0AXXX0805006824}{4:{177:1803261434}{451:0}}{1:F01BNIAIDJ0AXXX0805006824}{2:O1011433180326LGETKRSEAXXX08050129431803261433N}{4:\n" +
                ":20:AT1103771 39172\n" +
                ":28D:00001/00001\n" +
                ":50H:/0220113447000\n" +
                "P.T. LG ELECTRONICS SERVICE INDONES\n" +
                "JL PANGLIMA POLIM RAYA NO 69KEL MEL\n" +
                ":AWAL, KEC, KEBAYORAN BARU JAKARTA S\n" +
                "ELATAN\n" +
                ":52A:BNIAIDJAXXX\n" +
                ":30:180312\n" +
                ":21:AT1103771-39172\n" +
                ":32B:IDR100000000,\n" +
                ":57A:CITIIDJXXXX\n" +
                ":59:/107363009\n" +
                "P.T. LG ELECTRONICS SERVICE INDONEs\n" +
                "JL PANGLIMA POLIM RAYA NO 69KEL MEL\n" +
                "AWAI, KEC, KEBAYORAN BARU JAKARTA S\n" +
                "ELATAN\n" +
                ":70:OVERBOOKING\n" +
                ":77B:/BENEFRES/ID/SKN/21\n" +
                ":71A:OUR\n" +
                "-}{5:{MAC:00000000}{CHK:63CBC9C6E8A9}{TNG:}}{S:{SAC:}{COP:P}}";

        System.out.println(CheckRealTruncate.IsRealTruncateOnString(mt));
    }
}
