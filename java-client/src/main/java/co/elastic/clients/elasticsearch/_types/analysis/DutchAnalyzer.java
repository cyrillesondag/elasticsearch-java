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

package co.elastic.clients.elasticsearch._types.analysis;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.analysis.DutchAnalyzer

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/04a9498/specification/_types/analysis/analyzers.ts#L61-L64">API
 *      specification</a>
 */
@JsonpDeserializable
public class DutchAnalyzer implements AnalyzerVariant, JsonpSerializable {
	private final List<String> stopwords;

	// ---------------------------------------------------------------------------------------------

	private DutchAnalyzer(Builder builder) {

		this.stopwords = ApiTypeHelper.unmodifiable(builder.stopwords);

	}

	public static DutchAnalyzer of(Function<Builder, ObjectBuilder<DutchAnalyzer>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Analyzer variant kind.
	 */
	@Override
	public Analyzer.Kind _analyzerKind() {
		return Analyzer.Kind.Dutch;
	}

	/**
	 * API name: {@code stopwords}
	 */
	public final List<String> stopwords() {
		return this.stopwords;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "dutch");

		if (ApiTypeHelper.isDefined(this.stopwords)) {
			generator.writeKey("stopwords");
			generator.writeStartArray();
			for (String item0 : this.stopwords) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DutchAnalyzer}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<DutchAnalyzer> {
		@Nullable
		private List<String> stopwords;

		/**
		 * API name: {@code stopwords}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>stopwords</code>.
		 */
		public final Builder stopwords(List<String> list) {
			this.stopwords = _listAddAll(this.stopwords, list);
			return this;
		}

		/**
		 * API name: {@code stopwords}
		 * <p>
		 * Adds one or more values to <code>stopwords</code>.
		 */
		public final Builder stopwords(String value, String... values) {
			this.stopwords = _listAdd(this.stopwords, value, values);
			return this;
		}

		/**
		 * Builds a {@link DutchAnalyzer}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DutchAnalyzer build() {
			_checkSingleUse();

			return new DutchAnalyzer(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DutchAnalyzer}
	 */
	public static final JsonpDeserializer<DutchAnalyzer> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			DutchAnalyzer::setupDutchAnalyzerDeserializer);

	protected static void setupDutchAnalyzerDeserializer(ObjectDeserializer<DutchAnalyzer.Builder> op) {

		op.add(Builder::stopwords, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"stopwords");

		op.ignore("type");
	}

}
