/**
 */
package org.rm2pt.sample.basicclass.metamodel.basicclass.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.rm2pt.sample.basicclass.metamodel.basicclass.BasicclassFactory;
import org.rm2pt.sample.basicclass.metamodel.basicclass.BasicclassPackage;
import org.rm2pt.sample.basicclass.metamodel.basicclass.Student;
import org.rm2pt.sample.basicclass.metamodel.basicclass.Teacher;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BasicclassFactoryImpl extends EFactoryImpl implements BasicclassFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BasicclassFactory init() {
		try {
			BasicclassFactory theBasicclassFactory = (BasicclassFactory) EPackage.Registry.INSTANCE
					.getEFactory(BasicclassPackage.eNS_URI);
			if (theBasicclassFactory != null) {
				return theBasicclassFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BasicclassFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicclassFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case BasicclassPackage.CLASS:
			return createClass();
		case BasicclassPackage.STUDENT:
			return createStudent();
		case BasicclassPackage.TEACHER:
			return createTeacher();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.rm2pt.sample.basicclass.metamodel.basicclass.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Student createStudent() {
		StudentImpl student = new StudentImpl();
		return student;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Teacher createTeacher() {
		TeacherImpl teacher = new TeacherImpl();
		return teacher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicclassPackage getBasicclassPackage() {
		return (BasicclassPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BasicclassPackage getPackage() {
		return BasicclassPackage.eINSTANCE;
	}

} //BasicclassFactoryImpl
