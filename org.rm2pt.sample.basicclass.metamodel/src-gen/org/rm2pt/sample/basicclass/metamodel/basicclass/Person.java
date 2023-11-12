/**
 */
package org.rm2pt.sample.basicclass.metamodel.basicclass;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.rm2pt.sample.basicclass.metamodel.basicclass.Person#getName <em>Name</em>}</li>
 *   <li>{@link org.rm2pt.sample.basicclass.metamodel.basicclass.Person#getStudents <em>Students</em>}</li>
 *   <li>{@link org.rm2pt.sample.basicclass.metamodel.basicclass.Person#getTeachers <em>Teachers</em>}</li>
 *   <li>{@link org.rm2pt.sample.basicclass.metamodel.basicclass.Person#getTeacher <em>Teacher</em>}</li>
 *   <li>{@link org.rm2pt.sample.basicclass.metamodel.basicclass.Person#getStudent <em>Student</em>}</li>
 * </ul>
 *
 * @see org.rm2pt.sample.basicclass.metamodel.basicclass.BasicclassPackage#getPerson()
 * @model abstract="true"
 * @generated
 */
public interface Person extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.rm2pt.sample.basicclass.metamodel.basicclass.BasicclassPackage#getPerson_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.rm2pt.sample.basicclass.metamodel.basicclass.Person#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Students</b></em>' reference list.
	 * The list contents are of type {@link org.rm2pt.sample.basicclass.metamodel.basicclass.Person}.
	 * It is bidirectional and its opposite is '{@link org.rm2pt.sample.basicclass.metamodel.basicclass.Person#getTeachers <em>Teachers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Students</em>' reference list.
	 * @see org.rm2pt.sample.basicclass.metamodel.basicclass.BasicclassPackage#getPerson_Students()
	 * @see org.rm2pt.sample.basicclass.metamodel.basicclass.Person#getTeachers
	 * @model opposite="teachers"
	 * @generated
	 */
	EList<Person> getStudents();

	/**
	 * Returns the value of the '<em><b>Teachers</b></em>' reference list.
	 * The list contents are of type {@link org.rm2pt.sample.basicclass.metamodel.basicclass.Person}.
	 * It is bidirectional and its opposite is '{@link org.rm2pt.sample.basicclass.metamodel.basicclass.Person#getStudents <em>Students</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teachers</em>' reference list.
	 * @see org.rm2pt.sample.basicclass.metamodel.basicclass.BasicclassPackage#getPerson_Teachers()
	 * @see org.rm2pt.sample.basicclass.metamodel.basicclass.Person#getStudents
	 * @model opposite="students"
	 * @generated
	 */
	EList<Person> getTeachers();

	/**
	 * Returns the value of the '<em><b>Teacher</b></em>' reference list.
	 * The list contents are of type {@link org.rm2pt.sample.basicclass.metamodel.basicclass.Teacher}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teacher</em>' reference list.
	 * @see org.rm2pt.sample.basicclass.metamodel.basicclass.BasicclassPackage#getPerson_Teacher()
	 * @model derived="true"
	 * @generated
	 */
	EList<Teacher> getTeacher();

	/**
	 * Returns the value of the '<em><b>Student</b></em>' reference list.
	 * The list contents are of type {@link org.rm2pt.sample.basicclass.metamodel.basicclass.Student}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Student</em>' reference list.
	 * @see org.rm2pt.sample.basicclass.metamodel.basicclass.BasicclassPackage#getPerson_Student()
	 * @model derived="true"
	 * @generated
	 */
	EList<Student> getStudent();

} // Person
