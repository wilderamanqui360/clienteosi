package utilitarios;
/**
 * Clase de soporte para el manejo de BYTES
 * @version 1.0
 */
public class ByteUtil {
  private static final int DEFAULT_CHUNK_SIZE = 1024;


  /**
   * Guarda bytes en un archivo
   * @param fileName archivo donde se van a escribir los bytes
   * @param theBytes bytes a escribir
   * @throws java.io.IOException reporta los problemas al guardar los bytes en el archivo
   */
  public static void saveBytesToFile( String fileName, byte[] theBytes )
      throws java.io.IOException {
    saveBytesToStream( new java.io.FileOutputStream( fileName ), theBytes );
  }

  /**
   * Guarda bytes en un output stream y cierra el stream al finalizar sea exitosa o no la operaci�n.
   * @param out output stream donde se van a escribir los bytes
   * @param theBytes bytes a escribir
   * @throws java.io.IOException reporta los problemas al guardar los bytes en el stream
   */
  public static void saveBytesToStream( java.io.OutputStream out, byte[] theBytes )
      throws java.io.IOException {
    try {
      out.write( theBytes );
    }
    finally {
      out.flush();
      out.close();
    }
  }

  /**
   * Carga los bytes desde un archivo
   *
   * @param fileName archivo de donde se leeran los bytes
   * @return bytes leidos del archivo
   * @exception java.io.IOException reporta errores de IO
   */
  public static byte[] loadBytesFromFile( String fileName ) throws java.io.IOException {
    return loadBytesFromStream( new java.io.FileInputStream( fileName ), DEFAULT_CHUNK_SIZE );
  }

  /**
   * Carga los bytes desde un input stream 
   *
   * @param in stream de donde se leeran los bytes
   * @return bytes leidos del stream
   * @exception java.io.IOException reporta errores de IO
   */
  public static byte[] loadBytesFromStream( java.io.InputStream in ) throws java.io.IOException {
    return loadBytesFromStream( in, DEFAULT_CHUNK_SIZE );
  }

  /**
   * Carga los bytes desde un input stream .
   *
   * @param in stream de donde se leeran los bytes
   * @param chunkSize cantidad de bytes a leer en cada iteracion de lectura del stream
   * @return bytes leidos del stream
   * @exception java.io.IOException reporta errores de IO
   */
  public static byte[] loadBytesFromStream( java.io.InputStream in, int chunkSize )
      throws java.io.IOException {
    if( chunkSize < 1 )
      chunkSize = DEFAULT_CHUNK_SIZE;

    int count;
    java.io.ByteArrayOutputStream bo = new java.io.ByteArrayOutputStream();
    byte[] b = new byte[chunkSize];
    try {
      while( ( count = in.read( b, 0, chunkSize ) ) > 0 ) {
        bo.write( b, 0, count );
      }
      byte[] thebytes = bo.toByteArray();
      return thebytes;
    }
    finally {
      bo.close();
    }
  }
}
