/**
 */
package webapp.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import webapp.WebApp;
import webapp.WebappFactory;
import webapp.WebappPackage;

/**
 * This is the item provider adapter for a {@link webapp.WebApp} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WebAppItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebAppItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addFrameworkPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebApp_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebApp_name_feature", "_UI_WebApp_type"),
				 WebappPackage.Literals.WEB_APP__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Framework feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFrameworkPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WebApp_framework_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WebApp_framework_feature", "_UI_WebApp_type"),
				 WebappPackage.Literals.WEB_APP__FRAMEWORK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(WebappPackage.Literals.WEB_APP__APP_CONFIG);
			childrenFeatures.add(WebappPackage.Literals.WEB_APP__WEB_CONFIG);
			childrenFeatures.add(WebappPackage.Literals.WEB_APP__LIBRARY);
			childrenFeatures.add(WebappPackage.Literals.WEB_APP__VIEW);
			childrenFeatures.add(WebappPackage.Literals.WEB_APP__MODEL);
			childrenFeatures.add(WebappPackage.Literals.WEB_APP__CONTROLLER);
			childrenFeatures.add(WebappPackage.Literals.WEB_APP__RESOURCE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns WebApp.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/WebApp"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((WebApp)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_WebApp_type") :
			getString("_UI_WebApp_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(WebApp.class)) {
			case WebappPackage.WEB_APP__NAME:
			case WebappPackage.WEB_APP__FRAMEWORK:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case WebappPackage.WEB_APP__APP_CONFIG:
			case WebappPackage.WEB_APP__WEB_CONFIG:
			case WebappPackage.WEB_APP__LIBRARY:
			case WebappPackage.WEB_APP__VIEW:
			case WebappPackage.WEB_APP__MODEL:
			case WebappPackage.WEB_APP__CONTROLLER:
			case WebappPackage.WEB_APP__RESOURCE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(WebappPackage.Literals.WEB_APP__APP_CONFIG,
				 WebappFactory.eINSTANCE.createAppConfig()));

		newChildDescriptors.add
			(createChildParameter
				(WebappPackage.Literals.WEB_APP__WEB_CONFIG,
				 WebappFactory.eINSTANCE.createWebConfig()));

		newChildDescriptors.add
			(createChildParameter
				(WebappPackage.Literals.WEB_APP__LIBRARY,
				 WebappFactory.eINSTANCE.createLibrary()));

		newChildDescriptors.add
			(createChildParameter
				(WebappPackage.Literals.WEB_APP__VIEW,
				 WebappFactory.eINSTANCE.createView()));

		newChildDescriptors.add
			(createChildParameter
				(WebappPackage.Literals.WEB_APP__MODEL,
				 WebappFactory.eINSTANCE.createModel()));

		newChildDescriptors.add
			(createChildParameter
				(WebappPackage.Literals.WEB_APP__CONTROLLER,
				 WebappFactory.eINSTANCE.createController()));

		newChildDescriptors.add
			(createChildParameter
				(WebappPackage.Literals.WEB_APP__RESOURCE,
				 WebappFactory.eINSTANCE.createResource()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return WebAppEditPlugin.INSTANCE;
	}

}
