package com.face;

/**
 * 加密外观类：外观类
 */
public class EncryptFacade {

    //维持对其他对象的引用
    private FileReader reader;
    private CliperMachine cipher;
    private FileWriter writer;

    public EncryptFacade() {
        reader = new FileReader();
        cipher = new CliperMachine();
        writer = new FileWriter();
    }

    /**
     * 调用其他对象的业务方法
     * @param fileNameSrc
     * @param fileNameDes
     */
    public void fileEncrypt(String fileNameSrc, String fileNameDes) {
        String plainStr = reader.read(fileNameSrc);
        String encryptStr = cipher.encrypt(plainStr);
        writer.write(encryptStr, fileNameDes);
    }
}
