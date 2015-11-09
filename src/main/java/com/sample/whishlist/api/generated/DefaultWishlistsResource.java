
package com.sample.whishlist.api.generated;

import org.springframework.stereotype.Component;

import javax.inject.Singleton;
import javax.validation.OverridesAttribute;
import javax.ws.rs.core.Response;

/**
* Resource class containing the custom logic. Please put your logic here!
*/
@Component("apiWishlistsResource")
@Singleton
public class DefaultWishlistsResource implements com.sample.whishlist.api.generated.WishlistsResource
{
	@javax.ws.rs.core.Context
	private javax.ws.rs.core.UriInfo uriInfo;

	/* GET / */
	@Override
	public Response get(final PagedParameters paged)
	{
		// place some logic here
		return Response.ok()
			.entity(new java.util.ArrayList<Wishlist>()).build();
	}

	/* POST / */
	@Override
	public Response post(final PagedParameters paged, final Wishlist wishlist)
	{
		// place some logic here
		return Response.created(uriInfo.getAbsolutePath())
			.build();
	}

	/* GET /{wishlistId} */
	@Override
	public Response getByWishlistId(final YaasAwareParameters yaasAware, final java.lang.String wishlistId)
	{
		// place some logic here
		return Response.ok()
			.entity(new Wishlist()).build();
	}

	/* PUT /{wishlistId} */
	@Override
	public Response putByWishlistId(final YaasAwareParameters yaasAware, final java.lang.String wishlistId, final Wishlist wishlist)
	{
		// place some logic here
		return Response.ok()
			.build();
	}

	/* DELETE /{wishlistId} */
	@Override
	public Response deleteByWishlistId(final YaasAwareParameters yaasAware, final java.lang.String wishlistId)
	{
		// place some logic here
		return Response.noContent()
			.build();
	}

	@Override
	public Response getByWishlistIdWishlistItems(final PagedParameters paged, String wishlistId) {
		return Response.ok()
				.entity(new java.util.ArrayList<>())
				.build();
	}

	@Override
	public Response postByWishlistIdWishlistItems(final PagedParameters paged, String wishlistId, WishlistItem wishlistItem) {
		return Response
				.created(uriInfo.getAbsolutePath())
				.build();
	}
}
