package word;

import org.apache.poi.xwpf.usermodel.*;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.*;

import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class WordTest {
    public static void main(String[] args) {

        try {
            XWPFDocument doc = new XWPFDocument();
            makeText1(doc);
            makeTable1(doc);
            makeTable2(doc);
            makeText2(doc);

            OutputStream os = Files.newOutputStream(Paths.get("E:\\simpleWrite.docx"));
            //把doc输出到输出流
            doc.write(os);
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void makeText1(XWPFDocument doc) {
        XWPFParagraph p = doc.createParagraph();
        p.setAlignment(ParagraphAlignment.CENTER);
        XWPFRun run = p.createRun();
        run.addBreak();
        run.setText("家庭住房套数查询证明");
        run.setFontFamily("仿宋");
        run.setFontSize(16);
        run.setBold(true);

        p = doc.createParagraph();
        run = p.createRun();
        run.addTab();
        run.setFontFamily("仿宋");
        run.setFontSize(14);
        run.setText("申请人");

        run = p.createRun();
        run.setFontFamily("仿宋");
        run.setFontSize(14);
        run.setUnderline(UnderlinePatterns.SINGLE);
        run.setText("张承志");

        run = p.createRun();
        run.setFontFamily("仿宋");
        run.setFontSize(14);
        run.setText("（身份证号码：");

        run = p.createRun();
        run.setFontFamily("仿宋");
        run.setFontSize(14);
        run.setUnderline(UnderlinePatterns.SINGLE);
        run.setText("430702199407272019");

        run = p.createRun();
        run.setFontFamily("仿宋");
        run.setFontSize(14);
        run.setText("）申请出具本证明。经查询，申请人截至");

        run = p.createRun();
        run.setFontFamily("仿宋");
        run.setFontSize(14);
        run.setUnderline(UnderlinePatterns.SINGLE);
        run.setText("2023年09月06日16时28分38秒");

        run = p.createRun();
        run.setFontFamily("仿宋");
        run.setFontSize(14);
        run.setText("止，在长沙市房屋交易管理系统内，其家庭成员名下，共有下列2条住房信息。如查询结果为0，则表示该时间点为止在该系统内，未找到与查询申请人相匹配的信息。");
    }

    public static void makeText2(XWPFDocument doc) {
        XWPFParagraph p = doc.createParagraph();
        XWPFRun run = p.createRun();
        run.setText("备注：");
        run.setFontFamily("仿宋");
        run.setFontSize(12);
        run.setBold(true);

        p = doc.createParagraph();
        run = p.createRun();
        run.setFontFamily("仿宋");
        run.setFontSize(12);
        run.setText("1.本查询证明仅包含市本级已登记的商品住房有效信息（未包含浏阳、宁乡的商品住房信息，包含已办理不动产权属证书和已网签未办理不动产权属证书的住房）。");
        run.addBreak();
        run.setText("2.此证明查询结果为在该查询时间点时的有效信息，购房人在申请贷款、签订贷款合同时，贷款银行应以签订贷款合同时核验的住房套数信息为准，执行相应的住房信贷政策。");
        run.addBreak();
        run.addBreak();
        run.setText("                                            出具单位：");
        run.addBreak();
        run.setText("                                              2023年   月   日");
    }

    public static void makeTable1(XWPFDocument doc) {
        XWPFParagraph p = doc.createParagraph();
        p.setAlignment(ParagraphAlignment.CENTER);
        XWPFRun runT = p.createRun();
        runT.setText("家庭成员信息");
        runT.setFontFamily("仿宋");
        runT.setFontSize(14);

        XWPFTable table = doc.createTable(4, 4);
        //表格居中
        CTJc jc = table.getCTTbl().getTblPr().getJc();
        if(jc == null){
            jc = table.getCTTbl().getTblPr().addNewJc();
        }
        jc.setVal(STJc.CENTER);
        //表格整体宽度
        CTTblPr tablePr = table.getCTTbl().addNewTblPr();
        CTTblWidth width = tablePr.addNewTblW();
        width.setW(BigInteger.valueOf(8500));
        // 所有行对象
        List<XWPFTableRow> rows = table.getRows();
        for (int i = 0; i < rows.size(); i++) {
            // 获取行
            XWPFTableRow row = rows.get(i);
            // 行高
            if (i == 0 || i == 1) {
                row.setHeight(600);
            } else {
                row.setHeight(500);
            }
            // 新增单元格
            List<XWPFTableCell> cells = row.getTableCells();
            for (int j = 0; j < cells.size(); j++) {
                XWPFTableCell cell = cells.get(j);
                //单元格属性
                CTTcPr cellPr = cell.getCTTc().addNewTcPr();
                cellPr.addNewVAlign().setVal(STVerticalJc.CENTER);
                cellPr.addNewTcW().setW(BigInteger.valueOf(2000));
                if (i == 0 && j == 0) {
                    XWPFParagraph paragraph = cell.getParagraphs().get(0);
                    paragraph.setAlignment(ParagraphAlignment.CENTER);
                    XWPFRun run = paragraph.createRun();
                    run.setFontFamily("仿宋");
                    run.setFontSize(12);
                    run.setText("拟购房人");
                    run.addBreak();
                    run.setText("（申请人）");
                }
                if (i == 0 && j == 1) {
                    XWPFParagraph paragraph = cell.getParagraphs().get(0);
                    paragraph.setAlignment(ParagraphAlignment.CENTER);
                    XWPFRun run = paragraph.createRun();
                    run.setFontFamily("仿宋");
                    run.setFontSize(12);
                    run.setText("（姓名）");
                }
                if (i == 1 && j == 1) {
                    XWPFParagraph paragraph = cell.getParagraphs().get(0);
                    paragraph.setAlignment(ParagraphAlignment.CENTER);
                    XWPFRun run = paragraph.createRun();
                    run.setFontFamily("仿宋");
                    run.setFontSize(12);
                    run.setText("（身份证号码）");
                }
                if (i == 1) {
                    if (j == 0) {
                        XWPFParagraph paragraph = cell.getParagraphs().get(0);
                        paragraph.setAlignment(ParagraphAlignment.CENTER);
                        XWPFRun run = paragraph.createRun();
                        run.setFontFamily("仿宋");
                        run.setFontSize(12);
                        run.setText("姓名");
                    }
                    if (j==1) {
                        XWPFParagraph paragraph = cell.getParagraphs().get(0);
                        paragraph.setAlignment(ParagraphAlignment.CENTER);
                        XWPFRun run = paragraph.createRun();
                        run.setFontFamily("仿宋");
                        run.setFontSize(12);
                        run.setText("与申请人关系");
                    }
                    if (j==2) {
                        XWPFParagraph paragraph = cell.getParagraphs().get(0);
                        paragraph.setAlignment(ParagraphAlignment.CENTER);
                        XWPFRun run = paragraph.createRun();
                        run.setFontFamily("仿宋");
                        run.setFontSize(12);
                        run.setText("身份证号码");
                    }
                }
            }
        }
        XWPFTableRow row = table.createRow();
        table.addRow(row);
        // 合并工具
        CTVMerge startMerge1 = CTVMerge.Factory.newInstance();
        startMerge1.setVal(STMerge.RESTART);
        CTVMerge endMerge1 = CTVMerge.Factory.newInstance();
        endMerge1.setVal(STMerge.CONTINUE);
        table.getRow(0).getCell(0).getCTTc().getTcPr().setVMerge(startMerge1);
        table.getRow(1).getCell(0).getCTTc().getTcPr().setVMerge(endMerge1);

        mergeCellsHorizontal(table, 0, 1, 3);
        mergeCellsHorizontal(table, 1, 1, 3);
    }

    public static void makeTable2(XWPFDocument doc) {
        XWPFParagraph p = doc.createParagraph();
        p.setAlignment(ParagraphAlignment.CENTER);
        XWPFRun runT = p.createRun();
        runT.setText("家庭住房信息");
        runT.setFontFamily("仿宋");
        runT.setFontSize(14);

        XWPFTable table = doc.createTable(5, 5);
        //表格居中
        CTJc jc = table.getCTTbl().getTblPr().getJc();
        if(jc == null){
            jc = table.getCTTbl().getTblPr().addNewJc();
        }
        jc.setVal(STJc.CENTER);
        //表格整体宽度
        CTTblPr tablePr = table.getCTTbl().addNewTblPr();
        CTTblWidth width = tablePr.addNewTblW();
        width.setW(BigInteger.valueOf(8500));
        // 所有行对象
        List<XWPFTableRow> rows = table.getRows();
        for (int i = 0; i < rows.size(); i++) {
            // 获取行
            XWPFTableRow row = rows.get(i);
            // 行高
            if (i == 0) {
                row.setHeight(800);
            } else {
                row.setHeight(500);
            }
            // 新增单元格
            List<XWPFTableCell> cells = row.getTableCells();
            for (int j = 0; j < cells.size(); j++) {
                XWPFTableCell cell = cells.get(j);
                //单元格属性
                CTTcPr cellPr = cell.getCTTc().addNewTcPr();
                cellPr.addNewVAlign().setVal(STVerticalJc.CENTER);
                cellPr.addNewTcW().setW(BigInteger.valueOf(2000));
                if (i == 0) {
                    if (j==0) {
                        XWPFParagraph paragraph = cell.getParagraphs().get(0);
                        paragraph.setAlignment(ParagraphAlignment.CENTER);
                        XWPFRun run = paragraph.createRun();
                        run.setFontFamily("仿宋");
                        run.setFontSize(12);
                        run.setText("序号");
                    }
                    if (j==1) {
                        XWPFParagraph paragraph = cell.getParagraphs().get(0);
                        paragraph.setAlignment(ParagraphAlignment.CENTER);
                        XWPFRun run = paragraph.createRun();
                        run.setFontFamily("仿宋");
                        run.setFontSize(12);
                        run.setText("不动产权证号/购房合同编号");
                    }
                    if (j==2) {
                        XWPFParagraph paragraph = cell.getParagraphs().get(0);
                        paragraph.setAlignment(ParagraphAlignment.CENTER);
                        XWPFRun run = paragraph.createRun();
                        run.setFontFamily("仿宋");
                        run.setFontSize(12);
                        run.setText("房屋坐落");
                    }
                    if (j==3) {
                        XWPFParagraph paragraph = cell.getParagraphs().get(0);
                        paragraph.setAlignment(ParagraphAlignment.CENTER);
                        XWPFRun run = paragraph.createRun();
                        run.setFontFamily("仿宋");
                        run.setFontSize(12);
                        run.setText("是否办理长租房");
                    }
                    if (j==4) {
                        XWPFParagraph paragraph = cell.getParagraphs().get(0);
                        paragraph.setAlignment(ParagraphAlignment.CENTER);
                        XWPFRun run = paragraph.createRun();
                        run.setFontFamily("仿宋");
                        run.setFontSize(12);
                        run.setText("登记日期/合同签订日期");
                    }

                }
            }
        }
    }

    public static void mergeCellsHorizontal(XWPFTable table, int row, int startCell, int endCell) {
        for (int i = startCell; i <= endCell; i++) {
            XWPFTableCell cell = table.getRow(row).getCell(i);
            if (i == startCell) {
                // The first merged cell is set with RESTART merge value
                cell.getCTTc().addNewTcPr().addNewHMerge().setVal(STMerge.RESTART);
            } else {
                // Cells which join (merge) the first one, are set with CONTINUE
                cell.getCTTc().addNewTcPr().addNewHMerge().setVal(STMerge.CONTINUE);
            }
        }
    }

}
