/**
 */
package org.rm2pt.sample.basicclass.metamodel.basicclass.impl;

import org.eclipse.emf.ecore.EClass;

import org.rm2pt.sample.basicclass.metamodel.basicclass.BasicclassPackage;
import org.rm2pt.sample.basicclass.metamodel.basicclass.Student;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class StudentImpl extends PersonImpl implements Student {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicclassPackage.Literals.STUDENT;
	}

} //StudentImpl
