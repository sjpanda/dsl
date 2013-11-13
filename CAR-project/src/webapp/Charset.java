/**
 */
package webapp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Charset</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see webapp.WebappPackage#getCharset()
 * @model
 * @generated
 */
public enum Charset implements Enumerator {
	/**
	 * The '<em><b>ARMSCII8</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARMSCII8_VALUE
	 * @generated
	 * @ordered
	 */
	ARMSCII8(20, "ARMSCII8", "ARMSCII8"),

	/**
	 * The '<em><b>ASCII</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASCII_VALUE
	 * @generated
	 * @ordered
	 */
	ASCII(8, "ASCII", "ASCII"),

	/**
	 * The '<em><b>BIG5</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIG5_VALUE
	 * @generated
	 * @ordered
	 */
	BIG5(0, "BIG5", "BIG5"),

	/**
	 * The '<em><b>CP852</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CP852_VALUE
	 * @generated
	 * @ordered
	 */
	CP852(27, "CP852", "CP852"),

	/**
	 * The '<em><b>CP866</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CP866_VALUE
	 * @generated
	 * @ordered
	 */
	CP866(23, "CP866", "CP866"),

	/**
	 * The '<em><b>CP932</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CP932_VALUE
	 * @generated
	 * @ordered
	 */
	CP932(34, "CP932", "CP932"),

	/**
	 * The '<em><b>CP1250</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CP1250_VALUE
	 * @generated
	 * @ordered
	 */
	CP1250(17, "CP1250", "CP1250"),

	/**
	 * The '<em><b>CP1251</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CP1251_VALUE
	 * @generated
	 * @ordered
	 */
	CP1251(29, "CP1251", "CP1251"),

	/**
	 * The '<em><b>CP1256</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CP1256_VALUE
	 * @generated
	 * @ordered
	 */
	CP1256(30, "CP1256", "CP1256"),

	/**
	 * The '<em><b>CP1257</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CP1257_VALUE
	 * @generated
	 * @ordered
	 */
	CP1257(31, "CP1257", "CP1257"),

	/**
	 * The '<em><b>DEC8</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEC8_VALUE
	 * @generated
	 * @ordered
	 */
	DEC8(1, "DEC8", "DEC8"),

	/**
	 * The '<em><b>BINARY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BINARY_VALUE
	 * @generated
	 * @ordered
	 */
	BINARY(32, "BINARY", "BINARY"),

	/**
	 * The '<em><b>CP850</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CP850_VALUE
	 * @generated
	 * @ordered
	 */
	CP850(2, "CP850", "CP850"),

	/**
	 * The '<em><b>LATIN2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LATIN2_VALUE
	 * @generated
	 * @ordered
	 */
	LATIN2(6, "LATIN2", "LATIN2"),

	/**
	 * The '<em><b>EUCJMPS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EUCJMPS_VALUE
	 * @generated
	 * @ordered
	 */
	EUCJMPS(35, "EUCJMPS", "EUCJMPS"),

	/**
	 * The '<em><b>EUCKR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EUCKR_VALUE
	 * @generated
	 * @ordered
	 */
	EUCKR(13, "EUCKR", "EUCKR"),

	/**
	 * The '<em><b>GB2312</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GB2312_VALUE
	 * @generated
	 * @ordered
	 */
	GB2312(15, "GB2312", "GB2312"),

	/**
	 * The '<em><b>GBK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GBK_VALUE
	 * @generated
	 * @ordered
	 */
	GBK(18, "GBK", "GBK"),

	/**
	 * The '<em><b>GEOSTD8</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GEOSTD8_VALUE
	 * @generated
	 * @ordered
	 */
	GEOSTD8(33, "GEOSTD8", "GEOSTD8"),

	/**
	 * The '<em><b>GREEK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREEK_VALUE
	 * @generated
	 * @ordered
	 */
	GREEK(16, "GREEK", "GREEK"),

	/**
	 * The '<em><b>HEBREW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEBREW_VALUE
	 * @generated
	 * @ordered
	 */
	HEBREW(11, "HEBREW", "HEBREW"),

	/**
	 * The '<em><b>HP8</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HP8_VALUE
	 * @generated
	 * @ordered
	 */
	HP8(3, "HP8", "HP8"),

	/**
	 * The '<em><b>KEYBCS2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEYBCS2_VALUE
	 * @generated
	 * @ordered
	 */
	KEYBCS2(24, "KEYBCS2", "KEYBCS2"),

	/**
	 * The '<em><b>KOI8R</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KOI8R_VALUE
	 * @generated
	 * @ordered
	 */
	KOI8R(4, "KOI8R", "KOI8R"),

	/**
	 * The '<em><b>KOI8U</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KOI8U_VALUE
	 * @generated
	 * @ordered
	 */
	KOI8U(14, "KOI8U", "KOI8U"),

	/**
	 * The '<em><b>LATIN1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LATIN1_VALUE
	 * @generated
	 * @ordered
	 */
	LATIN1(5, "LATIN1", "LATIN1"),

	/**
	 * The '<em><b>LATIN5</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LATIN5_VALUE
	 * @generated
	 * @ordered
	 */
	LATIN5(19, "LATIN5", "LATIN5"),

	/**
	 * The '<em><b>LATIN7</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LATIN7_VALUE
	 * @generated
	 * @ordered
	 */
	LATIN7(28, "LATIN7", "LATIN7"),

	/**
	 * The '<em><b>MACCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MACCE_VALUE
	 * @generated
	 * @ordered
	 */
	MACCE(25, "MACCE", "MACCE"),

	/**
	 * The '<em><b>MACROMAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MACROMAN_VALUE
	 * @generated
	 * @ordered
	 */
	MACROMAN(26, "MACROMAN", "MACROMAN"),

	/**
	 * The '<em><b>SJIS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SJIS_VALUE
	 * @generated
	 * @ordered
	 */
	SJIS(10, "SJIS", "SJIS"),

	/**
	 * The '<em><b>SWE7</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SWE7_VALUE
	 * @generated
	 * @ordered
	 */
	SWE7(7, "SWE7", "SWE7"),

	/**
	 * The '<em><b>TIS620</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIS620_VALUE
	 * @generated
	 * @ordered
	 */
	TIS620(12, "TIS620", "TIS620"),

	/**
	 * The '<em><b>UCS2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UCS2_VALUE
	 * @generated
	 * @ordered
	 */
	UCS2(22, "UCS2", "UCS2"),

	/**
	 * The '<em><b>UJIS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UJIS_VALUE
	 * @generated
	 * @ordered
	 */
	UJIS(9, "UJIS", "UJIS"),

	/**
	 * The '<em><b>UTF8</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UTF8_VALUE
	 * @generated
	 * @ordered
	 */
	UTF8(21, "UTF8", "UTF8");

	/**
	 * The '<em><b>ARMSCII8</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ARMSCII8</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ARMSCII8
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ARMSCII8_VALUE = 20;

	/**
	 * The '<em><b>ASCII</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ASCII</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASCII
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ASCII_VALUE = 8;

	/**
	 * The '<em><b>BIG5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BIG5</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BIG5
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BIG5_VALUE = 0;

	/**
	 * The '<em><b>CP852</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CP852</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CP852
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CP852_VALUE = 27;

	/**
	 * The '<em><b>CP866</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CP866</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CP866
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CP866_VALUE = 23;

	/**
	 * The '<em><b>CP932</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CP932</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CP932
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CP932_VALUE = 34;

	/**
	 * The '<em><b>CP1250</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CP1250</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CP1250
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CP1250_VALUE = 17;

	/**
	 * The '<em><b>CP1251</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CP1251</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CP1251
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CP1251_VALUE = 29;

	/**
	 * The '<em><b>CP1256</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CP1256</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CP1256
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CP1256_VALUE = 30;

	/**
	 * The '<em><b>CP1257</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CP1257</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CP1257
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CP1257_VALUE = 31;

	/**
	 * The '<em><b>DEC8</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DEC8</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEC8
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DEC8_VALUE = 1;

	/**
	 * The '<em><b>BINARY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BINARY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BINARY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BINARY_VALUE = 32;

	/**
	 * The '<em><b>CP850</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CP850</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CP850
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CP850_VALUE = 2;

	/**
	 * The '<em><b>LATIN2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LATIN2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LATIN2
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LATIN2_VALUE = 6;

	/**
	 * The '<em><b>EUCJMPS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EUCJMPS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EUCJMPS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EUCJMPS_VALUE = 35;

	/**
	 * The '<em><b>EUCKR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EUCKR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EUCKR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EUCKR_VALUE = 13;

	/**
	 * The '<em><b>GB2312</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GB2312</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GB2312
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GB2312_VALUE = 15;

	/**
	 * The '<em><b>GBK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GBK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GBK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GBK_VALUE = 18;

	/**
	 * The '<em><b>GEOSTD8</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GEOSTD8</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GEOSTD8
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GEOSTD8_VALUE = 33;

	/**
	 * The '<em><b>GREEK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GREEK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GREEK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GREEK_VALUE = 16;

	/**
	 * The '<em><b>HEBREW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HEBREW</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HEBREW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HEBREW_VALUE = 11;

	/**
	 * The '<em><b>HP8</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HP8</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HP8
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HP8_VALUE = 3;

	/**
	 * The '<em><b>KEYBCS2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KEYBCS2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KEYBCS2
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KEYBCS2_VALUE = 24;

	/**
	 * The '<em><b>KOI8R</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KOI8R</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KOI8R
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KOI8R_VALUE = 4;

	/**
	 * The '<em><b>KOI8U</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KOI8U</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KOI8U
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KOI8U_VALUE = 14;

	/**
	 * The '<em><b>LATIN1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LATIN1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LATIN1
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LATIN1_VALUE = 5;

	/**
	 * The '<em><b>LATIN5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LATIN5</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LATIN5
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LATIN5_VALUE = 19;

	/**
	 * The '<em><b>LATIN7</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LATIN7</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LATIN7
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LATIN7_VALUE = 28;

	/**
	 * The '<em><b>MACCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MACCE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MACCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MACCE_VALUE = 25;

	/**
	 * The '<em><b>MACROMAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MACROMAN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MACROMAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MACROMAN_VALUE = 26;

	/**
	 * The '<em><b>SJIS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SJIS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SJIS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SJIS_VALUE = 10;

	/**
	 * The '<em><b>SWE7</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SWE7</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SWE7
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SWE7_VALUE = 7;

	/**
	 * The '<em><b>TIS620</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TIS620</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIS620
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TIS620_VALUE = 12;

	/**
	 * The '<em><b>UCS2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UCS2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UCS2
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UCS2_VALUE = 22;

	/**
	 * The '<em><b>UJIS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UJIS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UJIS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UJIS_VALUE = 9;

	/**
	 * The '<em><b>UTF8</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UTF8</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UTF8
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UTF8_VALUE = 21;

	/**
	 * An array of all the '<em><b>Charset</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Charset[] VALUES_ARRAY =
		new Charset[] {
			ARMSCII8,
			ASCII,
			BIG5,
			CP852,
			CP866,
			CP932,
			CP1250,
			CP1251,
			CP1256,
			CP1257,
			DEC8,
			BINARY,
			CP850,
			LATIN2,
			EUCJMPS,
			EUCKR,
			GB2312,
			GBK,
			GEOSTD8,
			GREEK,
			HEBREW,
			HP8,
			KEYBCS2,
			KOI8R,
			KOI8U,
			LATIN1,
			LATIN5,
			LATIN7,
			MACCE,
			MACROMAN,
			SJIS,
			SWE7,
			TIS620,
			UCS2,
			UJIS,
			UTF8,
		};

	/**
	 * A public read-only list of all the '<em><b>Charset</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Charset> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Charset</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Charset get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Charset result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Charset</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Charset getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Charset result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Charset</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Charset get(int value) {
		switch (value) {
			case ARMSCII8_VALUE: return ARMSCII8;
			case ASCII_VALUE: return ASCII;
			case BIG5_VALUE: return BIG5;
			case CP852_VALUE: return CP852;
			case CP866_VALUE: return CP866;
			case CP932_VALUE: return CP932;
			case CP1250_VALUE: return CP1250;
			case CP1251_VALUE: return CP1251;
			case CP1256_VALUE: return CP1256;
			case CP1257_VALUE: return CP1257;
			case DEC8_VALUE: return DEC8;
			case BINARY_VALUE: return BINARY;
			case CP850_VALUE: return CP850;
			case LATIN2_VALUE: return LATIN2;
			case EUCJMPS_VALUE: return EUCJMPS;
			case EUCKR_VALUE: return EUCKR;
			case GB2312_VALUE: return GB2312;
			case GBK_VALUE: return GBK;
			case GEOSTD8_VALUE: return GEOSTD8;
			case GREEK_VALUE: return GREEK;
			case HEBREW_VALUE: return HEBREW;
			case HP8_VALUE: return HP8;
			case KEYBCS2_VALUE: return KEYBCS2;
			case KOI8R_VALUE: return KOI8R;
			case KOI8U_VALUE: return KOI8U;
			case LATIN1_VALUE: return LATIN1;
			case LATIN5_VALUE: return LATIN5;
			case LATIN7_VALUE: return LATIN7;
			case MACCE_VALUE: return MACCE;
			case MACROMAN_VALUE: return MACROMAN;
			case SJIS_VALUE: return SJIS;
			case SWE7_VALUE: return SWE7;
			case TIS620_VALUE: return TIS620;
			case UCS2_VALUE: return UCS2;
			case UJIS_VALUE: return UJIS;
			case UTF8_VALUE: return UTF8;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Charset(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Charset
