package xyzy;

import cn.hutool.core.map.BiMap;
import cn.hutool.core.util.StrUtil;
import cn.hutool.poi.excel.ExcelReader;
import cn.hutool.poi.excel.ExcelUtil;
import cn.hutool.poi.excel.ExcelWriter;

import java.io.File;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class ShenKao {

    public static void main(String[] args) {
        /*获得1中的报考人数和岗位信息*/
        ExcelReader reader1 = ExcelUtil.getReader(new File("C:\\Users\\DELL\\Desktop\\报名.xlsx"),0);
        List<List<Object>> read = reader1.read();
        BiMap<String, String> map1 = new BiMap<>(new HashMap<>());
        for (int i = 1; i < read.size(); i++) {
            List<Object> objects = read.get(i);
            String gwmc = objects.get(0) + StrUtil.toString(objects.get(1)).replace('）', ')').replace('（', '(');
            String gwrs = String.valueOf(objects.get(6)) ;
            map1.put(gwmc, gwrs);
        }

//        /*获取CS中的成绩信息*/
//        ExcelReader reader3 = ExcelUtil.getReader(new File("C:\\Users\\DELL\\Desktop\\cs.xls"), 0);
//        List<List<Object>> read3 = reader3.read();
//        //人数过100
//        List<List<String>> listCs2 = new LinkedList<>();
//        read3.forEach(objects -> {
//            String gwmc = objects.get(1) + StrUtil.toString(objects.get(2)).replace('）', ')').replace('（', '(');
//            BigDecimal gwfs = new BigDecimal(objects.get(4).toString());
//            LinkedList<String> temp = new LinkedList<>();
//            if (null != map1.get(gwmc) && Integer.parseInt(map1.get(gwmc)) > 100) {
//                temp.add(gwmc);
//                temp.add(map1.get(gwmc));
//                temp.add(gwfs.toString());
//                listCs2.add(temp);
//            }
//        });
//        //人数过300
//        List<List<String>> listCs3 = new LinkedList<>();
//        read3.forEach(objects -> {
//            String gwmc = objects.get(1) + StrUtil.toString(objects.get(2)).replace('）', ')').replace('（', '(');
//            BigDecimal gwfs = new BigDecimal(objects.get(4).toString());
//            LinkedList<String> temp = new LinkedList<>();
//            if (null != map1.get(gwmc) && Integer.parseInt(map1.get(gwmc)) > 300) {
//                temp.add(gwmc);
//                temp.add(map1.get(gwmc));
//                temp.add(gwfs.toString());
//                listCs3.add(temp);
//            }
//        });
//        ExcelWriter writer = ExcelUtil.getWriter("C:\\Users\\DELL\\Desktop\\csSlFx.xlsx");
//        writer.setSheet("长沙行测人数>100进面");
//        writer.write(listCs2, true);
//        writer.setSheet("长沙行测人数>300进面");
//        writer.write(listCs3, true);
//        writer.close();
//    }

        /*获取CS中的成绩信息*/
        ExcelReader reader3 = ExcelUtil.getReader(new File("C:\\Users\\DELL\\Desktop\\结果.xlsx"), 0);
        List<List<Object>> read3 = reader3.read();
        //人数过100
        List<List<String>> listCs2 = new LinkedList<>();
        for (int i = 4; i < read3.size(); i++) {
            List<Object> objects = read3.get(i);
            String gwmc = objects.get(0) + StrUtil.toString(objects.get(1)).replace('）', ')').replace('（', '(');
            BigDecimal gwfs = new BigDecimal(objects.get(14).toString());
            LinkedList<String> temp = new LinkedList<>();
            if (null != map1.get(gwmc) && Integer.parseInt(map1.get(gwmc)) > 100) {
                temp.add(gwmc);
                temp.add(map1.get(gwmc));
                temp.add(gwfs.toString());
                listCs2.add(temp);
            }
        }
        //人数过300
        List<List<String>> listCs3 = new LinkedList<>();
        read3.forEach(objects -> {
            String gwmc = objects.get(0) + StrUtil.toString(objects.get(1)).replace('）', ')').replace('（', '(');
            BigDecimal gwfs = new BigDecimal(objects.get(3).toString());
            LinkedList<String> temp = new LinkedList<>();
            if (null != map1.get(gwmc) && Integer.parseInt(map1.get(gwmc)) > 300) {
                temp.add(gwmc);
                temp.add(map1.get(gwmc));
                temp.add(gwfs.toString());
                listCs3.add(temp);
            }
        });
        ExcelWriter writer = ExcelUtil.getWriter("C:\\Users\\DELL\\Desktop\\szFx.xlsx");
        writer.setSheet("人数>100进面");
        writer.write(listCs2, true);
        writer.setSheet("人数>300进面");
        writer.write(listCs3, true);
        writer.close();
    }
}
