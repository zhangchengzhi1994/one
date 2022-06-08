package pdf;

import com.itextpdf.awt.geom.Rectangle2D;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import com.itextpdf.text.pdf.parser.PdfReaderContentParser;

import java.io.FileOutputStream;
import java.util.List;
import java.util.Map;

public class PdfDeleteText {
    
    public static void main(String[] args) {
        try {
            PdfReader reader = null;
            FileOutputStream fileOutputStream = null;
            PdfStamper stamper = null;
            reader = new PdfReader("C:\\Users\\DELL\\Desktop\\s.pdf");
            fileOutputStream = new FileOutputStream("C:\\Users\\DELL\\Desktop\\s2.pdf");
            //新建一个PDF解析对象
            PdfReaderContentParser parser = new PdfReaderContentParser(reader);
    
            //包含了PDF页面的信息，作为处理的对象
            stamper = new PdfStamper(reader, fileOutputStream);
            for (int i = 1; i <= reader.getNumberOfPages(); i++) {
                PdfContentByte pdfContentByte = stamper.getOverContent(i);
                //新建一个ImageRenderListener对象，该对象实现了RenderListener接口，作为处理PDF的主要类
                TestRenderListener listener = new TestRenderListener();
                //解析PDF，并处理里面的文字
                parser.processContent(i, listener);
                //获取文字的矩形边框
                List<Rectangle2D.Float> rectText = listener.rectText;
                List<String> textList = listener.textList;
                List<Float> listY = listener.listY;
                List<Map<String, Rectangle2D.Float>> list_text = listener.rows_text_rect;
                for (String strtext : textList) {
                    System.out.println(strtext);
                    if (strtext.contains("指定文本")) {
                        int index = textList.indexOf(strtext);
                        Rectangle2D.Float position = rectText.get(index);
//                        Image image = Image.getInstance(imgpath);
//                        image.setAbsolutePosition(position.x, position.y);
//                        image.scaleAbsoluteHeight(119);
//                        image.scaleAbsoluteWidth(119);
//                        pdfContentByte.addImage(image);
                
                    }
                }
            }
        } catch (Exception e) {
        
        }
    }
    
}
