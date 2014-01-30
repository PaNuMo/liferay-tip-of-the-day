/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.rivetlogic.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link WebArticleHelperLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see WebArticleHelperLocalService
 * @generated
 */
public class WebArticleHelperLocalServiceWrapper
	implements WebArticleHelperLocalService,
		ServiceWrapper<WebArticleHelperLocalService> {
	public WebArticleHelperLocalServiceWrapper(
		WebArticleHelperLocalService webArticleHelperLocalService) {
		_webArticleHelperLocalService = webArticleHelperLocalService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _webArticleHelperLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_webArticleHelperLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _webArticleHelperLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public int countJournalArticlesByCategoryIds(
		java.util.List<java.lang.Long> categoryIds) {
		return _webArticleHelperLocalService.countJournalArticlesByCategoryIds(categoryIds);
	}

	@Override
	public java.util.List<com.liferay.portlet.journal.model.JournalArticle> getJournalArticlesByCategoryIds(
		long[] categoryIds) {
		return _webArticleHelperLocalService.getJournalArticlesByCategoryIds(categoryIds);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public WebArticleHelperLocalService getWrappedWebArticleHelperLocalService() {
		return _webArticleHelperLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedWebArticleHelperLocalService(
		WebArticleHelperLocalService webArticleHelperLocalService) {
		_webArticleHelperLocalService = webArticleHelperLocalService;
	}

	@Override
	public WebArticleHelperLocalService getWrappedService() {
		return _webArticleHelperLocalService;
	}

	@Override
	public void setWrappedService(
		WebArticleHelperLocalService webArticleHelperLocalService) {
		_webArticleHelperLocalService = webArticleHelperLocalService;
	}

	private WebArticleHelperLocalService _webArticleHelperLocalService;
}