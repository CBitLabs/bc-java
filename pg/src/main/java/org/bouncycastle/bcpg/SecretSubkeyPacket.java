package org.bouncycastle.bcpg;

import java.io.IOException;

/**
 * basic packet for a PGP secret key
 */
public class SecretSubkeyPacket 
    extends SecretKeyPacket
{
    /**
     * 
     * @param in
     * @throws IOException
     */
    SecretSubkeyPacket(
        BCPGInputStream    in)
        throws IOException
    { 
        super(SECRET_SUBKEY, in);
    }
    
    /**
     * 
     * @param pubKeyPacket
     * @param encAlgorithm
     * @param s2k
     * @param iv
     * @param secKeyData
     */
    public SecretSubkeyPacket(
        PublicKeyPacket  pubKeyPacket,
        int              encAlgorithm,
        S2K              s2k,
        byte[]           iv,
        byte[]           secKeyData)
    {
        super(SECRET_SUBKEY, pubKeyPacket, encAlgorithm, s2k, iv, secKeyData);
    }
 
    public SecretSubkeyPacket(
        PublicKeyPacket  pubKeyPacket,
        int              encAlgorithm,
        int              s2kUsage,
        S2K              s2k,
        byte[]           iv,
        byte[]           secKeyData)
    {
        super(SECRET_SUBKEY, pubKeyPacket, encAlgorithm, s2kUsage, s2k, iv, secKeyData);
    }
}
