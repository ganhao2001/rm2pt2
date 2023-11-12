/**
 */
package org.rm2pt.sample.basicclass.metamodel.basicclass.impl;

import org.eclipse.emf.ecore.EClass;

import org.rm2pt.sample.basicclass.metamodel.basicclass.BasicclassPackage;
import org.rm2pt.sample.basicclass.metamodel.basicclass.Teacher;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Teacher</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TeacherImpl extends PersonImpl implements Teacher {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TeacherImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicclassPackage.Literals.TEACHER;
	}

} //TeacherImpl
