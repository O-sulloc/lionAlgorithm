package week6.day2;

public class HashPractice {
    private int size = 10000;

    public HashPractice(int size) {
        this.size = size;
        this.table = new int[size];
    }

    private int[] table = new int[size];
    public HashPractice(){

    }

    public int hash(String key){
        int asciiSum = 0;
        for (int i = 0; i <key.length() ; i++) {
            asciiSum += key.charAt(i);
        }

        return asciiSum % size;
    }

    public void insert(String key, Integer value){
        int hashCode = hash(key);
        this.table[hashCode] = value;
        System.out.println(key + " " +hashCode +"방에 저장 완료");
    }

    public int search(String key){
        return this.table[hash(key)];
    }

    public static void main(String[] args) {
        String[] names = new String[]{"DongyeonKang",
                "SubinKang", "KwanwunKo", "HyunseokKo", "KyoungdukKoo", "YeonjiGu", "SoyeonKown", "OhsukKwon", "GunwooKim", "KiheonKim", "NayeongKim", "DohyeonKim", "MinkyoungKim", "MinjiKim", "SanghoKim", "SolbaeKim", "YejinKim", "EungjunKim", "JaegeunKim", "JeonghyeonKim", "JunhoKim", "JisuKim", "kimjinah", "HaneulKim", "HeejungKim", "KimoonPark", "EunbinPark", "JeongHoonPark", "JeminPark", "TaegeunPark", "JiwonBae", "SeunggeunBaek", "JihwanByeon", "HeungseopByeon", "JeongHeeSeo", "TaegeonSeo", "SeeYunSeok", "SuyeonSeong", "SeyoelSon", "MinjiSong", "JinwooSong", "hyunboSim", "SominAhn", "JiyoungAhn", "ChangbumAn", "SoonminEom",
                "HyeongsangOh", "SuinWoo", "JuwanWoo", "InkyuYoon", "GahyunLee", "DaonLee", "DohyunLee", "SanghunLee", "SujinLee", "AjinLee", "YeonJae", "HyeonjuLee", "HakjunYim", "SeoyunJang", "SeohyeonJang", "JinseonJang", "SujinJeon", "SeunghwanJeon", "DaehwanJung", "JaeHyunJeung", "HeejunJeong", "GukhyeonCho", "MunjuJo", "YejiJo", "ChanminJu", "MinjunChoi", "SujeongChoi", "SeunghoChoi", "AyeongChoi", "GeonjooHan", "JinhyuckHeo", "MinwooHwang", "SieunHwang",
                "JunhaHwang"};

        HashPractice hp = new HashPractice(200);
        for (int i = 0; i <names.length ; i++) {
            hp.insert(names[i], hp.hash(names[i]));
        }

        System.out.println(hp.search("JeonghyeonKim")); //나 135번 방에
    }
}
