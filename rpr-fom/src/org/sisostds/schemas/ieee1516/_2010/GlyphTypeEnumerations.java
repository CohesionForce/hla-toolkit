/**
 */
package org.sisostds.schemas.ieee1516._2010;

import java.lang.String;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Glyph Type Enumerations</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.sisostds.schemas.ieee1516._2010._2010Package#getGlyphTypeEnumerations()
 * @model extendedMetaData="name='glyphTypeEnumerations'"
 * @generated
 */
public final class GlyphTypeEnumerations extends AbstractEnumerator {
	/**
	 * The '<em><b>BITMAP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BITMAP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BITMAP_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BITMAP = 0;

	/**
	 * The '<em><b>JPG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>JPG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JPG_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int JPG = 1;

	/**
	 * The '<em><b>GIF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GIF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GIF_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GIF = 2;

	/**
	 * The '<em><b>PNG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PNG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PNG_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PNG = 3;

	/**
	 * The '<em><b>TIFF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TIFF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIFF_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TIFF = 4;

	/**
	 * The '<em><b>BITMAP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BITMAP
	 * @generated
	 * @ordered
	 */
	public static final GlyphTypeEnumerations BITMAP_LITERAL = new GlyphTypeEnumerations(BITMAP, "BITMAP", "BITMAP");

	/**
	 * The '<em><b>JPG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JPG
	 * @generated
	 * @ordered
	 */
	public static final GlyphTypeEnumerations JPG_LITERAL = new GlyphTypeEnumerations(JPG, "JPG", "JPG");

	/**
	 * The '<em><b>GIF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GIF
	 * @generated
	 * @ordered
	 */
	public static final GlyphTypeEnumerations GIF_LITERAL = new GlyphTypeEnumerations(GIF, "GIF", "GIF");

	/**
	 * The '<em><b>PNG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PNG
	 * @generated
	 * @ordered
	 */
	public static final GlyphTypeEnumerations PNG_LITERAL = new GlyphTypeEnumerations(PNG, "PNG", "PNG");

	/**
	 * The '<em><b>TIFF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIFF
	 * @generated
	 * @ordered
	 */
	public static final GlyphTypeEnumerations TIFF_LITERAL = new GlyphTypeEnumerations(TIFF, "TIFF", "TIFF");

	/**
	 * An array of all the '<em><b>Glyph Type Enumerations</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GlyphTypeEnumerations[] VALUES_ARRAY =
		new GlyphTypeEnumerations[] {
			BITMAP_LITERAL,
			JPG_LITERAL,
			GIF_LITERAL,
			PNG_LITERAL,
			TIFF_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Glyph Type Enumerations</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Glyph Type Enumerations</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GlyphTypeEnumerations get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GlyphTypeEnumerations result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Glyph Type Enumerations</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GlyphTypeEnumerations getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GlyphTypeEnumerations result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Glyph Type Enumerations</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GlyphTypeEnumerations get(int value) {
		switch (value) {
			case BITMAP: return BITMAP_LITERAL;
			case JPG: return JPG_LITERAL;
			case GIF: return GIF_LITERAL;
			case PNG: return PNG_LITERAL;
			case TIFF: return TIFF_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private GlyphTypeEnumerations(int value, String name, String literal) {
		super(value, name, literal);
	}

} //GlyphTypeEnumerations
