package 实体标注;

import org.junit.Test;

import java.io.*;

/**
 * @author Zhangyp
 * @version 1.0
 * @date 2020/3/11 0011 上午 10:02
 */
public class classfiy {
    @Test
    public void 民意分类(){
        String inurl="G:\\IntelliJ IDEA 2019.2.2\\Blog\\src\\main\\resources\\民意.txt";
        String out[]= new String[64];
        /*战争*/
        out[0]="G:\\IntelliJ IDEA 2019.2.2\\Blog\\src\\main\\resources\\民意\\民意分类\\战争认知\\战争.txt";
        out[1]="G:\\IntelliJ IDEA 2019.2.2\\Blog\\src\\main\\resources\\民意\\民意分类\\战争认知\\正义\\正义.txt";
        out[2]="G:\\IntelliJ IDEA 2019.2.2\\Blog\\src\\main\\resources\\民意\\民意分类\\战争认知\\非正义\\非正义.txt";
        /*民意反映方式*/
        out[3]="G:\\IntelliJ IDEA 2019.2.2\\Blog\\src\\main\\resources\\民意\\民意分类\\民意反应\\传真邮件\\传真邮件.txt";
        out[4]="G:\\IntelliJ IDEA 2019.2.2\\Blog\\src\\main\\resources\\民意\\民意分类\\民意反应\\信访\\信访.txt";
        out[5]="G:\\IntelliJ IDEA 2019.2.2\\Blog\\src\\main\\resources\\民意\\民意分类\\民意反应\\电话\\电话.txt";
        out[6]="G:\\IntelliJ IDEA 2019.2.2\\Blog\\src\\main\\resources\\民意\\民意分类\\民意反应\\新闻媒体\\新闻媒体.txt";
        out[7]="G:\\IntelliJ IDEA 2019.2.2\\Blog\\src\\main\\resources\\民意\\民意分类\\民意反应\\网络\\网络.txt";
        /*文化认同*/
        out[8]="G:\\IntelliJ IDEA 2019.2.2\\Blog\\src\\main\\resources\\民意\\民意分类\\文化认同\\饮食文化\\饮食文化.txt";
        out[9]="G:\\IntelliJ IDEA 2019.2.2\\Blog\\src\\main\\resources\\民意\\民意分类\\文化认同\\礼仪文化\\礼仪文化.txt";
        out[10]="G:\\IntelliJ IDEA 2019.2.2\\Blog\\src\\main\\resources\\民意\\民意分类\\文化认同\\民俗文化\\民俗文化.txt";
        out[11]="G:\\IntelliJ IDEA 2019.2.2\\Blog\\src\\main\\resources\\民意\\民意分类\\文化认同\\传统文化\\传统文化.txt";
        out[12]="G:\\IntelliJ IDEA 2019.2.2\\Blog\\src\\main\\resources\\民意\\民意分类\\文化认同\\不认同\\不认同.txt";
        out[13]="G:\\IntelliJ IDEA 2019.2.2\\Blog\\src\\main\\resources\\民意\\民意分类\\文化认同\\认同\\认同.txt";
        /*政治倾向*/
        out[14]="G:\\IntelliJ IDEA 2019.2.2\\Blog\\src\\main\\resources\\民意\\民意分类\\政治倾向\\鸽派\\鸽派.txt";
        out[15]="G:\\IntelliJ IDEA 2019.2.2\\Blog\\src\\main\\resources\\民意\\民意分类\\政治倾向\\鹰派\\鹰派.txt";
        /*主流观点、心理认知、意识形态*/
        out[16]="G:\\IntelliJ IDEA 2019.2.2\\Blog\\src\\main\\resources\\民意\\民意分类\\主流观点、心理认知、意识形态\\三合一.txt";
        /*其他*/
        out[17]="G:\\IntelliJ IDEA 2019.2.2\\Blog\\src\\main\\resources\\民意\\其他.txt";
        String str="";
        /*数组长度*/
        int length=18;
        FileWriter[] fileWriter = new FileWriter[length];
        BufferedWriter[] bw = new BufferedWriter[length];
        File in = new File(inurl);
        try {
            FileReader fr = new FileReader(in);
            BufferedReader br = new BufferedReader(fr);
            /*循环new FileWriter*/
            for (int i = 0; i <length ; i++) {
                fileWriter[i] = new FileWriter(out[i]);
            }
            /*循环new BufferWriter*/
            for (int j = 0; j <length ; j++) {
                bw[j] = new BufferedWriter(fileWriter[j]);
            }
            while ((str=br.readLine())!=null){
                /*战争*/
                if (str.contains("战争")||str.contains("战役")||str.contains("侵略")||str.contains("战场")){
                    bw[0].write(str);
                    bw[0].newLine();
                }
                /*文化*/
                /*传统文化*/
                else if (str.contains("妈祖") || str.contains("庙宇") || str.contains("闽南")||
                        str.contains("南岛") || str.contains("客家") || str.contains("宗教") || str.contains("传统文化")||
                        str.contains("饮食") || str.contains("美食")||
                        str.contains("民俗") || str.contains("蚵仔") || str.contains("龙潭")||
                        str.contains("生活文化") || str.contains("夜市") || str.contains("渔村文化") ||
                        str.contains("盐水蜂炮") || str.contains("头城抢孤")||
                        str.contains("礼仪")
                ) {
                    if (str.contains("妈祖") || str.contains("庙宇") || str.contains("闽南")
                            || str.contains("南岛") || str.contains("客家") || str.contains("宗教") || str.contains("传统文化")) {
                        bw[11].write(str);
                        bw[11].newLine();
                    }
                    if (str.contains("饮食文化") || str.contains("美食")) {

                        bw[8].write(str);
                        bw[8].newLine();
                    }
                    if (str.contains("民俗") || str.contains("蚵仔") || str.contains("龙潭")
                            || str.contains("生活文化") || str.contains("夜市") || str.contains("渔村文化")||str.contains("节日")
                            || str.contains("盐水蜂炮") || str.contains("头城抢孤")) {

                        bw[10].write(str);
                        bw[10].newLine();

                    }
                    if (str.contains("礼仪")||str.contains("礼节")) {

                        bw[9].write(str);
                        bw[9].newLine();
                    }
                }
                /*民意反映*/
                else if(str.contains("民意")||str.contains("民调")||str.contains("传真") || str.contains("邮件")||
                        str.contains("电话访问") || str.contains("电话咨询")||str.contains("网络")||
                        str.contains("新闻") || str.contains("媒体")||
                        str.contains("信件") || str.contains("寄信")||str.contains("书信"))
                {

                    if (str.contains("传真") || str.contains("邮件")) {
                        bw[3].write(str);
                        bw[3].newLine();
                    }
                    if (str.contains("电话") &&(str.contains("民调")||str.contains("民调"))){
                        bw[5].write(str);
                        bw[5].newLine();
                    }
                    /*网络*/
                    if (str.contains("网络")&&(str.contains("采集")
                            || str.contains("搜集")||str.contains("收集") || str.contains("汇集"))) {
                        bw[7].write(str);
                        bw[7].newLine();
                    }
                    /*新闻媒体*/
                    if ((str.contains("新闻") || str.contains("媒体"))&&(str.contains("意见")||
                            str.contains("意愿")||str.contains("看法")||str.contains("主张")||
                            str.contains("见地")||str.contains("定见")||str.contains("偏见")||
                            str.contains("成见")||str.contains("主见")||str.contains("观点")||
                            str.contains("见解"))) {
                        bw[6].write(str);
                        bw[6].newLine();
                    }
                    /*信访*/
                    if (str.contains("信件") || str.contains("寄信")||str.contains("书信")) {
                        bw[4].write(str);
                        bw[4].newLine();
                    }

                }
                /*政治倾向*/
                else if (str.contains("谈判")||str.contains("商议")||str.contains("制裁")||str.contains("施压")){
                    /*鸽派*/
                    if (str.contains("谈判")||str.contains("商议")){
                        bw[14].write(str);
                        bw[14].newLine();
                    }
                    /*鹰派*/
                    if (str.contains("制裁")||str.contains("施压")){
                        bw[15].write(str);
                        bw[15].newLine();
                    }
                }
                /*主流观点、心理认知、意识形态*/
                else if (str.contains("意识")||str.contains("心理")||str.contains("观点")){
                    bw[16].write(str);
                    bw[16].newLine();
                }
                else {
                    bw[17].write(str);
                    bw[17].newLine();
                }
            }

            for (int i = 0; i <length ; i++) {
                bw[i].close();
            }
            br.close();
            fr.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
