/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.snapshot;

import co.elastic.clients.elasticsearch.snapshot.restore.SnapshotRestore;
import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: snapshot.restore.Response
public final class RestoreResponse implements ToJsonp {
	private final SnapshotRestore snapshot;

	// ---------------------------------------------------------------------------------------------

	protected RestoreResponse(Builder builder) {

		this.snapshot = Objects.requireNonNull(builder.snapshot, "snapshot");

	}

	/**
	 * API name: {@code snapshot}
	 */
	public SnapshotRestore snapshot() {
		return this.snapshot;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("snapshot");
		this.snapshot.toJsonp(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RestoreResponse}.
	 */
	public static class Builder implements ObjectBuilder<RestoreResponse> {
		private SnapshotRestore snapshot;

		/**
		 * API name: {@code snapshot}
		 */
		public Builder snapshot(SnapshotRestore value) {
			this.snapshot = value;
			return this;
		}

		/**
		 * API name: {@code snapshot}
		 */
		public Builder snapshot(Function<SnapshotRestore.Builder, ObjectBuilder<SnapshotRestore>> fn) {
			return this.snapshot(fn.apply(new SnapshotRestore.Builder()).build());
		}

		/**
		 * Builds a {@link RestoreResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RestoreResponse build() {

			return new RestoreResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for RestoreResponse
	 */
	public static final JsonpValueParser<RestoreResponse> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, RestoreResponse::setupRestoreResponseParser);

	protected static void setupRestoreResponseParser(DelegatingJsonpValueParser<RestoreResponse.Builder> op) {

		op.add(Builder::snapshot, SnapshotRestore.JSONP_PARSER, "snapshot");

	}

}