package pdf;

import com.spire.pdf.*;
import com.spire.pdf.graphics.PdfFont;
import com.spire.pdf.graphics.PdfFontFamily;
import com.spire.pdf.graphics.PdfFontStyle;
import com.spire.pdf.graphics.fonts.PdfUsedFont;

public class PdfDeleteText2 {
    
    public static void main(String[] args) throws Exception {
        //创建PdfDocument类的对象
        PdfDocument pdf = new PdfDocument();
    
        //加载PDF文档
        pdf.loadFromFile("C:\\Users\\DELL\\Desktop\\s.pdf");
    
        //获取文档中的所有字体
        PdfUsedFont[] fonts = pdf.getUsedFonts();
        PdfUsedFont font_1 = null;
        //遍历所有字体
        for (PdfUsedFont font: fonts) {
            font.getSize();
            System.out.println(font.getSize());
            if ("Helvetica".equals(font.getName())) {
                font_1 = font;
            }
        }
        PdfFont newfont = new PdfFont(PdfFontFamily.Times_Roman, 0.1F, PdfFontStyle.Italic);
        font_1.replace(newfont);
        //保存文档
        pdf.saveToFile("C:\\Users\\DELL\\Desktop\\ReplaceAllFonts.pdf");
        pdf.dispose();
    }
}
    
