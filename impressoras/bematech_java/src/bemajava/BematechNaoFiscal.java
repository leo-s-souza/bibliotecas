/**
 * Copyright(c) 2016 CASA Automação LTDA. Todos os direitos reservados. Este
 * software faz parte da propriedade da CASA Automação LTDA.
 */
package bemajava;

import com.sun.jna.Library;

/**
 * Classe de funções de impressora não fical bematech.
 *
 * @author Jean Regis <producao1@casaautomacao.com.br>
 */
public interface BematechNaoFiscal extends Library {

    public int IniciaPorta(String porta);

    public int FechaPorta();

    public int BematechTX(String bufTrans);

    public int ComandoTX(String bufTrans, int tamBufTrans);

    public int CaracterGrafico(String bufTrans, int tamBufTrans);

    public int DocumentInserted();

    public int Le_Status();

    public int AutenticaDoc(String texto, int tempo);

    public int Le_Status_Gaveta();

    public int ConfiguraTamanhoExtrato(int numeroLinhas);

    public int HabilitaExtratoLongo(int flag);

    public int HabilitaEsperaImpressao(int flag);

    public int EsperaImpressao();

    public int ConfiguraModeloImpressora(int modeloImpressora);

    public int AcionaGuilhotina(int modo);

    public int FormataTX(String bufTras, int tipoLetra, int italic, int sublin, int expand, int enfat);

    public int HabilitaPresenterRetratil(int flag);

    public int ProgramaPresenterRetratil(int tempo);

    public int VerificaPapelPresenter();

    /*
     * Função para Configuração dos Códigos de Barras
     */
    public int ConfiguraCodigoBarras(int altura, int largura, int posicaoCaracteres, int fonte, int margem);

    /*
     * Funções para impressão dos códigos de barras.
     */
    public int ImprimeCodigoBarrasUPCA(String codigo);

    public int ImprimeCodigoBarrasUPCE(String codigo);

    public int ImprimeCodigoBarrasEAN13(String codigo);

    public int ImprimeCodigoBarrasEAN8(String codigo);

    public int ImprimeCodigoBarrasCODE39(String codigo);

    public int ImprimeCodigoBarrasCODE93(String codigo);

    public int ImprimeCodigoBarrasCODE128(String codigo);

    public int ImprimeCodigoBarrasITF(String codigo);

    public int ImprimeCodigoBarrasCODABAR(String codigo);

    public int ImprimeCodigoBarrasISBN(String codigo);

    public int ImprimeCodigoBarrasMSI(String codigo);

    public int ImprimeCodigoBarrasPLESSEY(String codigo);

    public int ImprimeCodigoBarrasPDF417(int nivelCorrecaoErros, int altura, int largura, int colunas, String codigo);

    public int ImprimeCodigoQRCODE(int errorCorrectionLevel, int moduleSize, int codeType, int qrCodeVersion, int encodingModes, String codeQr);

    /*
     * Funções para impressão de BitMap.
     */
    public int ImprimeBitmap(String name, int mode);

    public int ImprimeBmpEspecial(String name, int xScale, int yScale, int angle);

    public int AjustaLarguraPapel(int width);

    public int SelectDithering(int mode);

    public int PrinterReset();

    public int LeituraStatusEstendido(byte[] array);

    public int IoControl(int flag, boolean mode);

    public int DefineNVBitmap(int count, String[] filenames);

    public int PrintNVBitmap(int image, int mode);

    public int Define1NVBitmap(String filename);

    public int DefineDLBitmap(String filename);

    public int PrintDLBitmap(int mode);

    /*
     * Função de Firmware.
     */
    public int AtualizaFirmware(String filename);
}
